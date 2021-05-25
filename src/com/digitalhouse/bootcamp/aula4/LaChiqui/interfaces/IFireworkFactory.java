package com.digitalhouse.bootcamp.aula4.LaChiqui.interfaces;

import com.digitalhouse.bootcamp.aula4.LaChiqui.domains.Firework;

import java.util.List;

public interface IFireworkFactory {

    public void addPackage(Firework firework);

    public void addPackage(List<Firework> fireworks);

    public void updatePackage(int index, List<Firework> fireworks);

    public List<Firework> getPackage(int index);

    public void launch(int index);

    public void launch();

}
