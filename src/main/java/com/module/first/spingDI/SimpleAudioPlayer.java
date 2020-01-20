package com.module.first.spingDI;

import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;


@Component
@Profile("simple-player")
@Priority(value = 3)
public class SimpleAudioPlayer implements Player {
    @Override
    public void play(Song song) {
        System.out.println("Playing song..."+song.name);
    }
}
