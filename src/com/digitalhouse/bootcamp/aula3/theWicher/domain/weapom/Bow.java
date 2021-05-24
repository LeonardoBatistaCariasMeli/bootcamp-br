package com.digitalhouse.bootcamp.aula3.theWicher.domain.weapom;

import com.digitalhouse.bootcamp.aula3.theWicher.domain.CharacterClass;
import com.digitalhouse.bootcamp.aula3.theWicher.domain.interfaces.Weapom;

import java.util.ArrayList;
import java.util.List;

public class Bow implements Weapom {
    private String name;
    private Integer damage;
    private List<CharacterClass> characterClassList;

    public Bow() {
        this.name = "Bow";
        this.damage = 1000;
        this.characterClassList = new ArrayList<CharacterClass>();
        characterClassList.add(CharacterClass.GENERIC);
        characterClassList.add(CharacterClass.ARCHER);

    }

    @Override
    public Integer damage() {
        return damage;
    }

    @Override
    public Boolean classUses(CharacterClass characterClass) {
        return characterClassList.contains(characterClass);
    }

    @Override
    public String name() {
        return this.name;
    }
}
