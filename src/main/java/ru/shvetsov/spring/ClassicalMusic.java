package ru.shvetsov.spring;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClassicalMusic implements IMusic {

    public static ClassicalMusic getInstance(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Classical music song name...";
    }

    private void myInitMethod() {
        System.out.println("Init " + ClassicalMusic.class.getName() + " Bean");
    }

    private void myDestroyMethod() {
        System.out.println("Destroy " + ClassicalMusic.class.getName() + " Bean");
    }
}
