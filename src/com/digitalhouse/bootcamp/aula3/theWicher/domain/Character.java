package com.digitalhouse.bootcamp.aula3.theWicher.domain;

import com.digitalhouse.bootcamp.aula3.theWicher.domain.interfaces.ICharacterAction;
import com.digitalhouse.bootcamp.aula3.theWicher.domain.interfaces.Weapom;

public class Character implements ICharacterAction {
    private Integer level;
    private String name;
    private Integer life;
    private CharacterClass characterClass;
    private Weapom weapom;

    public Character(String name, CharacterClass characterClass) {
        this.level = 1;
        this.name = name;
        this.characterClass = characterClass;
        this.life = 100;
    }

    @Override
    public Integer attack() {
        if(this.weapom != null){
            System.out.println("you attacked with " +
                    this.weapom.name() +
                    " and caused " + this.weapom.damage() + " damage");
            return this.weapom.damage();
        }
        System.out.println("you attacked with the hands and caused " + this.life + " damage");
        return this.life;
    }

    @Override
    public boolean use(Weapom weapom) {
        if(weapom.classUses(this.characterClass)){
            this.weapom = weapom;
            return true;
        }
        return false;
    }

    public String weapom() {
        return this.weapom.name();
    }

    public String gameClass() {
        return this.characterClass.toString();
    }

    public String name() {
        return this.name;
    }
}
