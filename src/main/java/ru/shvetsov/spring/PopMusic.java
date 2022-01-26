package ru.shvetsov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements IMusic {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("PopMusic song 1");
        songs.add("PopMusic song 2");
        songs.add("PopMusic song 3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}