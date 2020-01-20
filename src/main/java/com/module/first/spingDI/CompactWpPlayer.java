package com.module.first.spingDI;

import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("compact-player")
public class CompactWpPlayer implements Player {
    @Override
    public void play(Song song) {
        System.out.println("Refactored");
        System.out.println("Playing song..."+song.name);
    }
}
