package ru.shvetsov.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import ru.shvetsov.spring.music.ClassicalMusic;
import ru.shvetsov.spring.Computer;
import ru.shvetsov.spring.IMusic;
import ru.shvetsov.spring.MusicPlayer;
import ru.shvetsov.spring.music.PopMusic;
import ru.shvetsov.spring.music.RockMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ru.shvetsov.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean
    public List<IMusic> musicList() {
//        @Bean
//        public ArrayList<Hero> action() {
//            ArrayList<Hero> result = new ArrayList<>();
//            result.add(new Terminator());
//            result.add(new Rambo());
//            return result;
//        }

        return Arrays.asList(classicalMusic(), rockMusic(), popMusic());// Этот лист неизменяемый (immutable)
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
