package ru.tukmakov.springcourse.genres;

import ru.tukmakov.springcourse.Music;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
    private List<String> jazzSongs = new ArrayList<>();

    {
        jazzSongs.add("Strange Fruit");
        jazzSongs.add("My Funny Valentine");
        jazzSongs.add("Autumn in New York");
    }
    @Override
    public List<String> getSongs() {
        return jazzSongs;
    }
}
