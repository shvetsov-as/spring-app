package ru.shvetsov.spring;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
//IoC
public class MusicPlayer {
    private IMusic music;

    private String name;
    private int volume;

    public MusicPlayer(IMusic music){
        this.music = music;
    }

    public void setMusic(IMusic music){
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Now playing: " + music.getSong());
    }

}

