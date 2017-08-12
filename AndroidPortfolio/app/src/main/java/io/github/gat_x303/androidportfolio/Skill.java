package io.github.gat_x303.androidportfolio;

/**
 * Created by allan on 2017-08-11.
 * Skill is a class the is used to create an object that contains a string and an int
 * int - links to the img resource id that will used to display the image
 * string - the name of the skill
 */

public class Skill {

    public String name;
    public int image;

    public Skill(String skill, int resourceID) {

        name = skill;
        image = resourceID;

    }
}
