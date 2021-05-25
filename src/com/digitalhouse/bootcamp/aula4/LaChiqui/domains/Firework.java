package com.digitalhouse.bootcamp.aula4.LaChiqui.domains;

import com.digitalhouse.bootcamp.aula4.LaChiqui.interfaces.IFireworks;

import java.util.UUID;

public class Firework implements IFireworks {

    private UUID id;

    private String sound;

    public Firework(UUID id, String sound) {
        this.id = id;
        this.sound = sound;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getsound() {
        return sound;
    }

    public void setsound(String sound) {
        this.sound = sound;
    }

    @Override
    public void makeNoise() {

        System.out.println(this.sound);
    }
}
