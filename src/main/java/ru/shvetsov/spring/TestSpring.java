package ru.shvetsov.spring;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.shvetsov.spring.config.SpringConfig;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //IMusic music = context.getBean("musicBean", IMusic.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);


        //Can change implementation class in applicationContext.xml
        //Init & Destroy - type VOID
        //No input args!
        //For scope = "prototype" -> spring doesn't call Destroy-method
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        //MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        context.close();

    }
}
