package com.module.first.springApp;

import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Primary
@Order(1)
public class CompactWpPlayer1 implements Player {

    public CompactWpPlayer1() {
        System.out.println("Calling constructor of CompactWpPlayer1");
    }

    @Override
    public void play(Song song) {
        System.out.println("Refactored");
        System.out.println("Playing song..."+song.name);
    }
}
