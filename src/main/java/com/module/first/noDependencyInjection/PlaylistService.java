package com.module.first.noDependencyInjection;

import com.module.first.common.dao.SongDao;
import com.module.first.common.ds.Song;

public class PlaylistService {


    //NO DI : conventional way.

    public void play(String name){
        SongDao songDao = new SongDao();
        Song song = songDao.search(name);

        SimpleAudioPlayer player = new SimpleAudioPlayer();
        player.play(song);
    }
}
