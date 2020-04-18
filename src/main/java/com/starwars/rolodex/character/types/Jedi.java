package com.starwars.rolodex.character.types;

import java.util.List;

/**
 * The universe file containing the main method for the Star Wars Rolodex App
 *
 */
public interface Jedi extends Character {

    public String getRank();

    public List<String> getWeapons();
    

}