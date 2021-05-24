package com.digitalhouse.bootcamp.aula3.theWicher;

import com.digitalhouse.bootcamp.aula3.theWicher.domain.Character;
import com.digitalhouse.bootcamp.aula3.theWicher.domain.CharacterClass;
import com.digitalhouse.bootcamp.aula3.theWicher.domain.weapom.Bow;
import com.digitalhouse.bootcamp.aula3.theWicher.domain.weapom.Staff;
import com.digitalhouse.bootcamp.aula3.theWicher.domain.weapom.Sword;

public class Teste {

    public static void main(String[] args) {
        var bow = new Bow();
        var sword = new Sword();
        var staff = new Staff();

        var character = new Character("Caçador BR", CharacterClass.GENERIC);

        character.attack();
        character.use(bow);
        character.attack();
        character.use(staff); // Archer não pode usar
        character.attack();
        character.use(sword); // Archer não pode usar
        character.attack();

        System.out.println(
                "Character Name : " + character.name() + "\n" +
                "Class  : " + character.gameClass() + "\n" +
                        " Weapom : " +  character.weapom() + "\n"
        );


    }
}
