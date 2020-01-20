package com.module.first.manuallyDI;

import com.module.first.common.dao.SongDao;

public class Runner {

    public static void main(String[] args){
        PlaylistService playlistService = new PlaylistService(new SongDao(),new SimpleAudioPlayer());

        playlistService.play("newSong");

    }
}
