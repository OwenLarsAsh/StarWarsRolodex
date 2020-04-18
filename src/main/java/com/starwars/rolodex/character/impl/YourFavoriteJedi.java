package com.starwars.rolodex.character.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.starwars.rolodex.character.types.Jedi;

/**
 * The mysterious jedi... Aka me :)
 */
public class YourFavoriteJedi implements Jedi {

    private final List<String> attributes = new ArrayList<String>();

    { // Default constructor
        attributes.add("Art");
        attributes.add("Rap Music");
        attributes.add("Star Wars");
        attributes.add("Nerd");
        attributes.add("Deep Thinker");
        attributes.add("Science and History");
        attributes.add("Thoughtful");
        attributes.add("Geology - Knows how to pronounce rocks like Gneiss and Schist");
        attributes.add("Lifetime Learner");
        attributes.add("Eclectic Music Taste");
        attributes.add("Loves Collective Soul");
        attributes.add("Loves To Dance All Night");
        attributes.add("Shows Off The Woman I love");

    }

    public List<String> getAttributes() {
        return attributes;
    }

    public String getRank() {
        return "Master";
    }
    public List<String> getWeapons() {
        return Arrays.asList("LightSaber");
    }

}