package com.module.first.springApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private PlaylistService1 playlistService1;

    @PostMapping(value = "/song/{name}")
    public ResponseEntity<String> playSong(@PathVariable("name") String name){
        try{
            playlistService1.play(name);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        System.out.println("hello");
        return new ResponseEntity(HttpStatus.OK);
    }
}
