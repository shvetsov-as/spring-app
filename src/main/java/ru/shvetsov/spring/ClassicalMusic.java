package ru.shvetsov.spring;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClassicalMusic implements IMusic {


    @Bean
    @Qualifier("public")
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
