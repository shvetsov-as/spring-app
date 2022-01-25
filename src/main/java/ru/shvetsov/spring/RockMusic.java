package ru.shvetsov.spring;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RockMusic implements IMusic{

    public static RockMusic getInstance(){
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Rock music song name...";
    }
    private void myInitMethod() {
        System.out.println("Init " + RockMusic.class.getName() + " Bean");
    }

    private void myDestroyMethod() {
        System.out.println("Destroy " + RockMusic.class.getName() + " Bean");
    }
}
