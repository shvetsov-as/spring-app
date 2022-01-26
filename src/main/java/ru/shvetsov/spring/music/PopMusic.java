package ru.shvetsov.spring.music;

import ru.shvetsov.spring.IMusic;

//@Component
public class PopMusic implements IMusic {

    @Override
    public String getSong() {
        return "PopMusic song playing";
    }
}