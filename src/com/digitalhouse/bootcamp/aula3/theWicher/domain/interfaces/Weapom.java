package com.digitalhouse.bootcamp.aula3.theWicher.domain.interfaces;

import com.digitalhouse.bootcamp.aula3.theWicher.domain.CharacterClass;

public interface Weapom {
    Integer damage();
    Boolean classUses(CharacterClass characterClass);
    String name();
}
