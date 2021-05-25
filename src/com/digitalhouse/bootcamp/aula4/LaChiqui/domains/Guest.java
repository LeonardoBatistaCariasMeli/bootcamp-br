package com.digitalhouse.bootcamp.aula4.LaChiqui.domains;

import com.digitalhouse.bootcamp.aula4.LaChiqui.enums.GuestType;
import com.digitalhouse.bootcamp.aula4.LaChiqui.interfaces.IGuest;

public class Guest implements IGuest {

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

    @Override
    public void eatCake() {
        System.out.println("Nome: " + this.name);
    }
}
