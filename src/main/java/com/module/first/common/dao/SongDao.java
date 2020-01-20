package com.module.first.common.dao;

import com.module.first.common.ds.Song;
import org.springframework.stereotype.Component;

@Component
public class SongDao{

    public SongDao() {
        System.out.println("Calling constructor of SongDao");
    }

    public Song search(String name){
        System.out.println("Searching an object");
        return new Song(name);
    }

    public void save(Song song){


    }
}
