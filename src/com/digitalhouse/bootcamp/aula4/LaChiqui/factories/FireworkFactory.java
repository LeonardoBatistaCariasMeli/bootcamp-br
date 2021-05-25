package com.digitalhouse.bootcamp.aula4.LaChiqui.factories;

import com.digitalhouse.bootcamp.aula4.LaChiqui.domains.Firework;
import com.digitalhouse.bootcamp.aula4.LaChiqui.interfaces.IFireworkFactory;

import java.util.ArrayList;
import java.util.List;

public class FireworkFactory implements IFireworkFactory {

    private final List<List<Firework>> fireworks = new ArrayList<>();

    public List<List<Firework>> getFireworks() {
        return fireworks;
    }

    @Override
    public void addPackage(Firework firework) {

        if (firework == null) {
            System.out.println("Sem pólvora!!!");
        }

        var list = new ArrayList<>();
        list.add(firework);

        this.fireworks.add((List)list);
    }

    @Override
    public void addPackage(List<Firework> fireworks) {

        this.fireworks.add(fireworks);
    }

    @Override
    public void updatePackage(int index, List<Firework> fireworks) {

        this.fireworks.set(index, fireworks);
    }

    @Override
    public List<Firework> getPackage(int index) {

        return this.fireworks.get(index);
    }

    @Override
    public void launch(int index) {

        this.fireworks.get(index).forEach(f -> {
            System.out.println(f.getsound());
        });

        this.fireworks.remove(index);
    }

    @Override
    public void launch() {

        this.fireworks.forEach(p -> {
            p.forEach(f -> {
                System.out.println(f.getsound());
            });
        });
    }
}
