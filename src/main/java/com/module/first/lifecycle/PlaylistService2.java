package com.module.first.lifecycle;

import com.module.first.common.dao.SongDao;
import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import com.module.first.javaconfig.SpringBean3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PlaylistService2 {

    @Value("${spring.profiles.active}")
    public String activeProfiles;

    //spring DI
    public  Player player;

    public  SongDao songDao;

    public PlaylistService2() {
        System.out.println("Calling constructor of PlaylistService2");
    }

    @Autowired
    @Qualifier(value = "compactWpPlayer1")
   // @Qualifier(value = "test") for SimpleAudioPlayer1
    public void setPlayer(Player player) {
        System.out.println(getClass().getSimpleName()+"::setPlayer");
        this.player = player;
    }

    // @Qualifier(value = "test") for SimpleAudioPlayer1
    @Autowired(required = false)
    public void setPlayerAgain(Player player) {
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
        System.out.println("Before initialising bean : look into bean object");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PlaylistService2 : After bean destroyed");
    }
}
