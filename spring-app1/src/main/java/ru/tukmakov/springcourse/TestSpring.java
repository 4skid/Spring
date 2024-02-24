package ru.tukmakov.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.tukmakov.springcourse.config.SpringConfig;
import ru.tukmakov.springcourse.genres.ClassicalMusic;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       musicPlayer.playMusic();

        context.close();
    }
}
