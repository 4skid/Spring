package ru.tukmakov.springcourse.genres;

import ru.tukmakov.springcourse.Music;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    private List<String> rockSongs = new ArrayList<>();

    {
        rockSongs.add("Purple Haze");
        rockSongs.add("Whole Lotta Love");
        rockSongs.add("Sympathy For The Devil");
    }

    @Override
    public List<String> getSongs() {
        return rockSongs;
    }
}
