package ru.shvetsov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //IMusic music = context.getBean("musicBean", IMusic.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //Setter Dep injection from applicationContext.xml using musicPlayer.properties
        //Can change implementation class in applicationContext.xml
        //Init & Destroy - type VOID
        //No input args!
        //For scope = "prototype" -> spring doesn't call Destroy-method
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
