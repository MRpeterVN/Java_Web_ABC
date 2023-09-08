package com.example.spring_web_music.model;


public class Artist {

    private int id;

    private String name;

    private String image;

    public Artist(){
        super();
    }

    public Artist(String name, String image){
        super();
        this.name = name;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
