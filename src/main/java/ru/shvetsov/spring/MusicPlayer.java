package ru.shvetsov.spring;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
//IoC
public class MusicPlayer {
    private List<IMusic> musicList;

    private String name;
    private int volume;

    public MusicPlayer(List<IMusic> musicList) {
        this.musicList = musicList;
    }

    public void setMusicList(List<IMusic> musicList) {
        this.musicList = musicList;
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
        musicList.stream().forEach(music -> System.out.println(music.getSong()));
    }

}

