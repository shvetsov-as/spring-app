package ru.shvetsov.spring;

import lombok.AllArgsConstructor;

@AllArgsConstructor

//IoC
public class MusicPlayer {
    private IMusic music;

    public void playMusic(){
        System.out.println("Now playing: " + music.getSong());
    }
}

