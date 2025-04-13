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
    @Override
    public int hashCode() {
        System.out.println("Original code:"+super.hashCode());
        return 27;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("The reference is Singer");
            Singer singer1 = this;
            Singer singer2 = (Singer) obj;
            if (singer1.name == singer2.name ) {
                System.out.println("The objects are same.....");
                return true;
            }
        }
        return false;
    }
}
