package ru.tukmakov.springcourse.genres;

import org.springframework.stereotype.Component;
import ru.tukmakov.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;



public class ClassicalMusic implements Music {
    private List<String> classicalSongs = new ArrayList<>();

    {
        classicalSongs.add("The Four Seasons");
        classicalSongs.add("Für Elise");
        classicalSongs.add("Carmen");
    }

    @Override
    public List<String> getSongs() {
        return classicalSongs;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
