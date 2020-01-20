package com.module.first.spingDI;

import com.module.first.common.dao.SongDao;
import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import com.module.first.javaconfig.SpringBean3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

@Service
public class PlaylistService {
    //spring DI
    public final Player player;

    public final SongDao songDao;
    //When difference impl of interface then to avoid confusion define Primary of qualifier
    //More than one bean for player -> use primary -> more than one primary bean then go for qualifier. Here primary is used.

    public PlaylistService(Player player, SongDao songDao) {
        this.player = player;
        this.songDao = songDao;
    }
    //But incase of ple constructor we need to specify autowire to help spring uniquely identify which constructor to use. Autowire any one.
    //Autowired(false), Optional & Nullable values will not stop constructor initialisation.
    @Autowired
    public PlaylistService(SongDao songDao, Player player, @Nullable SpringBean3 springBean3) {
        this.player = player;
        this.songDao = songDao;
    }


    public void play(String name){
        Song song = songDao.search(name);
        player.play(song);
    }


    @PreDestroy
    public void destroy(){
        System.out.println("PlaylistService : After bean destroyed");
    }
}
