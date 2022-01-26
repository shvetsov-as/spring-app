package ru.shvetsov.spring;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;


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

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private PopMusic popMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }


    public void playMusic(MusicGenre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        switch (genre){
            case CLASSICAL:
                System.out.println(classicalMusic.getSongs().get(randomNumber));
                break;
            case ROCK:
                System.out.println(rockMusic.getSongs().get(randomNumber));
                break;
            case POP:
                System.out.println(popMusic.getSongs().get(randomNumber));
                break;
            default:
                System.out.println("No songs");
        }

    }
}
