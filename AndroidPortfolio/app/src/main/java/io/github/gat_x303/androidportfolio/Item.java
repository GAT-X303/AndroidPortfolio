package io.github.gat_x303.androidportfolio;

/*
Used to create objects that will either contain and
string + int = Skill
string + string = Project
 */

import java.net.URL;

public class Item {

    public String name;
    public String sub;
    public int image;
    public String address;

    //Used to created skills
    public Item(String skill, int resourceID) {

        name = skill;
        image = resourceID;

    }

    //Used to create projects
    public Item(String title, String description, String address) {
        name = title;
        sub = description;
        this.address = address;
    }
}
