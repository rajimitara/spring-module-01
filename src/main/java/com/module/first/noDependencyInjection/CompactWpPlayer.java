package com.module.first.noDependencyInjection;

import com.module.first.common.ds.Song;

public class CompactWpPlayer {

    public void play(Song song) {
        System.out.println("Refactored");
        System.out.println("Playing song..."+song.name);
    }
}
