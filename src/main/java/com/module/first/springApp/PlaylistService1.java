package com.module.first.springApp;

import com.module.first.common.dao.SongDao;
import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class PlaylistService1 {

    //spring DI
    public final Player player;

    public final SongDao songDao;

    //Automatically picks bean with same name though interface referred.
    //But incase of ple constructor we need to specify autowire to help spring uniquely identify which constructor to use.

    public PlaylistService1(SongDao songDao, Player compactWpPlayer1) {
        this.player = compactWpPlayer1;
        this.songDao = songDao;
    }

    public void play(String name){
        Song song = songDao.search(name);
        player.play(song);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PlaylistService1 : After bean destroyed");
    }
}
