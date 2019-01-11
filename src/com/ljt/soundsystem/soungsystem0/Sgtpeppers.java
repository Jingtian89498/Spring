package com.ljt.soundsystem.soungsystem0;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class Sgtpeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + "by " + artist);
    }
}
