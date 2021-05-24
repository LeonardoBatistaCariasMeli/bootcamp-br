package com.digitalhouse.bootcamp.aula3.theWicher.domain.weapom;

import com.digitalhouse.bootcamp.aula3.theWicher.domain.CharacterClass;
import com.digitalhouse.bootcamp.aula3.theWicher.domain.interfaces.Weapom;

import java.util.ArrayList;
import java.util.List;

public class Sword implements Weapom {
    private String name;
    private Integer damage;
    private List<CharacterClass> characterClassList;

    public Sword() {
        this.name = "Sword";
        this.damage = 50;
        this.characterClassList = new ArrayList<CharacterClass>();
        characterClassList.add(CharacterClass.GENERIC);

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
