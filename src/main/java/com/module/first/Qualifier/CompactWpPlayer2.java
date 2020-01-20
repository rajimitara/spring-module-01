package com.module.first.Qualifier;

import com.module.first.common.ds.Song;
import com.module.first.common.service.Player;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
@CustomQualifier(CustomQualifier.Type.File)
public class CompactWpPlayer2 implements Player, Ordered {

    public CompactWpPlayer2() {
        System.out.println("Calling constructor of CompactWpPlayer1");
    }

    @Override
    public void play(Song song) {
        System.out.println("Refactored");
        System.out.println("Playing song..."+song.name);
    }

    @Override
    public int getOrder() {
        return 4;
    }
}
