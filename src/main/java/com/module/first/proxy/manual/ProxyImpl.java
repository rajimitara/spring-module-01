package com.module.first.proxy.manual;

import com.module.first.common.dao.SongDao;
import com.module.first.common.ds.Song;

//create a proxy class for song DS with constructor injection
public class ProxyImpl{

    private SongDao songDao;

    public ProxyImpl(SongDao songDao) {
        this.songDao = songDao;
    }

    public Song search(String name) {
        System.out.println("Searching an object");
        return songDao.search(name);
    }

    public void save(Song song) {
        System.out.println("Going to save song object");
        songDao.save(song);
        System.out.println("Song object saved");
    }
}
