package com.module.first.javaconfig;

import com.module.first.common.service.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class SpringBean3 {

    @Autowired
    protected SpringBean1 springBean1;
    @Autowired
    protected SpringBean2 springBean2;

    @Autowired
    protected Optional<Player> springbeans;

    @Autowired
    @Nullable
    protected List<Player> players;

    @Autowired(required = false)
    protected SpringBean5 springBean5;


    public SpringBean3() {
        System.out.println(
                getClass().getSimpleName() + "springBean1=" + springBean1 +
                        getClass().getSimpleName() + "springBean2="  +springBean2 +
                        getClass().getSimpleName() + "springbeans=" + springbeans +
                        getClass().getSimpleName() + "springBean4=" + players +
                        getClass().getSimpleName() + "springBean5=" + springBean5

        );

    }
   /* @Autowired
    public SpringBean3( Optional<Player> player,@Nullable SpringBean2 springBean2, @Autowired(required = false)  PlaylistService playlistService) {
        System.out.println(
                getClass().getSimpleName() + "springBean1=" + springBean1 +
                        getClass().getSimpleName() + "player=" + player +
                        getClass().getSimpleName() + "springBean2=" + springBean2 +
                        //getClass().getSimpleName() + "players=" + players +
                        getClass().getSimpleName() + "playlistService=" + playlistService
        );
    }*/
    @PostConstruct
    public void postcontruct() {
        System.out.println(
                getClass().getSimpleName() + "springBean1=" + springBean1 +
                        getClass().getSimpleName() + "springBean2="  +springBean2 +
                        getClass().getSimpleName() + "springbeans=" + springbeans +
                        getClass().getSimpleName() + "springBean4=" + players +
                        getClass().getSimpleName() + "springBean5=" + springBean5
        );
    }

    public void createInstance() {
        System.out.println(
                getClass().getSimpleName() + "springBean1=" + springBean1 +
                        getClass().getSimpleName() + "springBean2="  +springBean2 +
                        getClass().getSimpleName() + "springbeans=" + springbeans +
                        getClass().getSimpleName() + "springBean4=" + players +
                        getClass().getSimpleName() + "springBean5=" + springBean5
        );
        System.out.println("Automatically");
        springbeans.stream().map(r -> r.getClass().getSimpleName()).forEach(System.out::println);
    }
}

