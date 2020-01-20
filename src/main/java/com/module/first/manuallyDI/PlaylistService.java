package com.module.first.manuallyDI;

import com.module.first.common.dao.SongDao;
import com.module.first.common.ds.Song;

import javax.annotation.PreDestroy;

public class PlaylistService {

    //manual DI
    public final SimpleAudioPlayer player;

    public final SongDao songDao;

    public PlaylistService(SongDao songDao, SimpleAudioPlayer player) {
        this.player = player;
        this.songDao = songDao;
    }

    public void play(String name){
        Song song = songDao.search(name);
        player.play(song);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("After bean destroyed - non web client standalone application");
    }
}
