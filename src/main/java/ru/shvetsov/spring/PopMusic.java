package ru.shvetsov.spring;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Component
public class PopMusic implements IMusic{

    @Bean
    @Qualifier("public")
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