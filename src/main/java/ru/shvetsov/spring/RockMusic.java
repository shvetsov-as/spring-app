package ru.shvetsov.spring;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements IMusic {
    private List<String> songs = new ArrayList<>();

    @Override
    public String getSong() {
        return "RockMusic song playing";
    }
}
