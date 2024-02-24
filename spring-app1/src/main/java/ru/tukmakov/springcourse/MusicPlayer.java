package ru.tukmakov.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        Random random = new Random();
        System.out.println("Playing: " + musicList.get(random.nextInt(musicList.size())).getSongs().get(random.nextInt(3)) +
                " with volume " + this.volume);
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
