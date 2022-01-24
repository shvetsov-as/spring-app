package ru.shvetsov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //IMusic music = context.getBean("musicBean", IMusic.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //Auto Dep injection from applicationContext.xml
        //Can change implementation class in applicationContext.xml
        //doesn't need to change code below.
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
