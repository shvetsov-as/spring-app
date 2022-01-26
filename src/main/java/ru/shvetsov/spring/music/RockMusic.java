package ru.shvetsov.spring.music;


import ru.shvetsov.spring.IMusic;

//@Component
public class RockMusic implements IMusic {

    @Override
    public String getSong() {
        return "RockMusic song playing";
    }
}
