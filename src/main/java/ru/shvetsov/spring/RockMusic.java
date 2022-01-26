package ru.shvetsov.spring;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Component("musicBean") //we can add an id (default = "rockMusic")

public class RockMusic implements IMusic {

    @Bean
    @Qualifier("public")
    public static RockMusic getInstance() {
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
