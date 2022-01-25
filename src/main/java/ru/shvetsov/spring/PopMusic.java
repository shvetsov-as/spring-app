package ru.shvetsov.spring;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PopMusic implements IMusic{

    public static PopMusic getInstance(){
        return new PopMusic();
    }

    @Override
    public String getSong() {
        return "Pop music song name...";
    }
    private void myInitMethod() {
        System.out.println("Init " + PopMusic.class.getName() + " Bean");
    }

    private void myDestroyMethod() {
        System.out.println("Destroy " + PopMusic.class.getName() + " Bean");
    }
}