package ru.shvetsov.spring;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;


@NoArgsConstructor
@Component
//IoC
public class MusicPlayer {
//      field injection
//      @Autowired
// may be @Qualifier ("classicalMusic") to avoid duplication if [private IMusic music] is interface and we have several same beans;
//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
//    private PopMusic popMusic;

//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic musicBean, PopMusic popMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = musicBean;
//        this.popMusic = popMusic;
//    }

//    Setter injection
//    @Autowired
//    public void setMusicORanotherNAMEallWillBeCorrect(IMusic music) {
//        this.music = music;
//    }

    private IMusic music1;
    private IMusic music2;
    private IMusic music3;

@Autowired
    public MusicPlayer(@Qualifier("classicalMusic") IMusic music1,
                       @Qualifier("musicBean")IMusic music2,
                       @Qualifier("popMusic")IMusic music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic() {
        return "Now playing " + music1.getSong();
//        System.out.println("Now playing " + rockMusic.getSong());
//        System.out.println("Now playing " + popMusic.getSong());
    }
}

