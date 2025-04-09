package com.xworkz.tostring.internal;

public class Singer {
    private String name;
    private int age;
    private String genre;
    private String hitSong;

    public Singer(String name, int age, String genre, String hitSong) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.hitSong = hitSong;
    }

    @Override
    public String toString() {
        return "Singer: " + name + ", Age: " + age + ", Genre: " + genre + ", Hit Song: " + hitSong;
    }
}
