package com.starwars.rolodex.character.types;

import java.util.List;

/**
 * The character interface, which will be the base super type for all Star Wars
 * characters
 *
 */
public interface Character {


    public List<String> getAttributes();

    public String getName();
    
    public List<String> getAlternativeNames();

}