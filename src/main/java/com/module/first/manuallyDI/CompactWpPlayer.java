package com.module.first.manuallyDI;

import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Primary //comment for manualDI
@Component
public class CompactWpPlayer implements Player {
    @Override
    public void play(Song song) {
        System.out.println("Refactored");
        System.out.println("Playing song..."+song.name);
    }
}
