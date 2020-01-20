package com.module.first.spingDI;

import com.module.first.springApp.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        //makes use of profile to select bean from same interface type.
        AnnotationConfigApplicationContext annotationConfigApplicationContext = getSpringContext("simple-player");
        //annotationConfigApplicationContext.registerShutdownHook();
        PlaylistService playlistService = annotationConfigApplicationContext.getBean(PlaylistService.class);
        playlistService.play("Annotation based we create container");
        //annotationConfigApplicationContext.close();

    }
//create our own container
    private static AnnotationConfigApplicationContext getSpringContext(String profile) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles(profile);
        annotationConfigApplicationContext.register(Config.class);
        annotationConfigApplicationContext.refresh();
        return annotationConfigApplicationContext;
    }
}
