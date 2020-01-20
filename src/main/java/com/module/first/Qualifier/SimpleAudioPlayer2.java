package com.module.first.Qualifier;

import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import org.springframework.stereotype.Component;

@Component
@CustomQualifier(CustomQualifier.Type.DB)
public class SimpleAudioPlayer2 implements Player {

    public SimpleAudioPlayer2() {
        System.out.println("Calling constructor of SimpleAudioPlayer1");
    }

    @Override
    public void play(Song song) {
        System.out.println("Playing song..."+song.name);
    }
}
