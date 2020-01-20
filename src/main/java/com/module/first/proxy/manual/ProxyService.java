package com.module.first.proxy.manual;

import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;

public class ProxyService implements Player {

    public void findSong(){
        System.out.println("");
        System.out.println("");
    }

    @Override
    public void play(Song song) {
        System.out.println("");
        System.out.println("");
    }
}
