package ru.shvetsov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IMusic music = context.getBean("musicBean", IMusic.class);//Can change implementation class in applicationContext.xml
        //Dep injection
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
