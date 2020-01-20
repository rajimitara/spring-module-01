package com.module.first.springApp;

import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("test")
public class SimpleAudioPlayer1 implements Player {

    public SimpleAudioPlayer1() {
        System.out.println("Calling constructor of SimpleAudioPlayer1");
    }

    @Override
    public void play(Song song) {
        System.out.println("Playing song..."+song.name);
    }
}
