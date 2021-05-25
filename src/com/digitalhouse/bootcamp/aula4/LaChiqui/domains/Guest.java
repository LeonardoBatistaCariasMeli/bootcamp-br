package com.digitalhouse.bootcamp.aula4.LaChiqui.domains;

import com.digitalhouse.bootcamp.aula4.LaChiqui.enums.GuestType;

public class Guest {

    private GuestType type;

    private String name;

    public Guest(GuestType type, String name) {
        this.type = type;
        this.name = name;
    }

    public GuestType getType() {
        return type;
    }

    public void setType(GuestType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eatCake() {
        if (this.type == GuestType.MELI) {
            System.out.println("Viva la Chiqui !!");
        }
    }
}
