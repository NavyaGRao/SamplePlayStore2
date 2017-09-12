package com.pratap.gplaystore.models;

/**
 * Created by pratap.kesaboyina on 01-12-2015.
 */
public class Section {


    private String name;
    private String image;


    public Section() {
    }

    public Section(String name, String image) {
        this.name = name;
        this.image = image;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
