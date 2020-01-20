package com.module.first.Qualifier;

import com.module.first.common.dao.SongDao;
import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PlaylistService3 {


    //spring DI
    public  Player player;

    public  SongDao songDao;

    public PlaylistService3() {
        System.out.println("Calling constructor of PlaylistService2");
    }

    /*@Autowired
    public PlaylistService2(SongDao songDao, SimpleAudioPlayer1 player) {
        this.player = player;
        this.songDao = songDao;
    }*/
    @Autowired
    @CustomQualifier(CustomQualifier.Type.File)
    public void setPlayer(Player player) {
        System.out.println(getClass().getSimpleName()+"::setPlayer");
        this.player = player;
    }

    @Autowired
    public void setSongDao(SongDao songDao) {
        System.out.println(getClass().getSimpleName()+"::setSongDao");
        this.songDao = songDao;
    }


    public void play(String name){
        Song song = songDao.search(name);
        player.play(song);
    }

    @PostConstruct
    public void init(){
        System.out.println("Before initialising bean : look into bean definition");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PlaylistService2 : After bean destroyed");
    }
}
