package ru.shvetsov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //IMusic music = context.getBean("musicBean", IMusic.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);


        //Can change implementation class in applicationContext.xml
        //Init & Destroy - type VOID
        //No input args!
        //For scope = "prototype" -> spring doesn't call Destroy-method
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);
        musicPlayer.playMusic(MusicGenre.POP);

        context.close();
    }
}
