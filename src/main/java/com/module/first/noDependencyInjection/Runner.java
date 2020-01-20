package com.module.first.noDependencyInjection;

public class Runner {

    public static void main(String[] args){
        PlaylistService playlistService = new PlaylistService();

        playlistService.play("newSong");

    }
}
