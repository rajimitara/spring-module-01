package com.module.first.noDependencyInjection;

import com.module.first.common.ds.Song;

public class SimpleAudioPlayer {

    public void play(Song song) {
        System.out.println("Playing song... "+song.name);
    }
}
