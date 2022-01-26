package ru.shvetsov.spring;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;


@NoArgsConstructor
//@Component
//IoC
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<IMusic> musicList;

    public MusicPlayer(List<IMusic> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong()
                + " with volume " + this.volume + " from " + this.name;
    }
}
