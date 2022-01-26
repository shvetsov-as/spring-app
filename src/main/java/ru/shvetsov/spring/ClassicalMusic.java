package ru.shvetsov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements IMusic {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("ClassicalMusic song 1");
        songs.add("ClassicalMusic song 2");
        songs.add("ClassicalMusic song 3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
