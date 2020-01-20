package com.module.first.manuallyDI;

import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class SimpleAudioPlayer implements Player {
    @Override
    public void play(Song song) {
        System.out.println("Primary Bean Playing song..."+song.name);
    }
}
