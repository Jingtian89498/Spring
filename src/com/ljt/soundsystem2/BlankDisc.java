package com.ljt.soundsystem2;

public class BlankDisc implements CompactDisc{

    private String title;
    private String artist;

    public BlankDisc(){

    }

    public BlankDisc(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    @Override
    public void play(){
        System.out.println("Playing " + title + "by " + artist);
    }
}
