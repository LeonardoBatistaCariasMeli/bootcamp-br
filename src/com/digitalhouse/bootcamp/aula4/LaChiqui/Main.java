package com.digitalhouse.bootcamp.aula4.LaChiqui;

import com.digitalhouse.bootcamp.aula4.LaChiqui.domains.Firework;
import com.digitalhouse.bootcamp.aula4.LaChiqui.domains.MeliGuest;
import com.digitalhouse.bootcamp.aula4.LaChiqui.domains.StandartGuest;
import com.digitalhouse.bootcamp.aula4.LaChiqui.factories.FireworkFactory;
import com.digitalhouse.bootcamp.aula4.LaChiqui.factories.GuestFactory;
import com.digitalhouse.bootcamp.aula4.LaChiqui.interfaces.IFireworkFactory;
import com.digitalhouse.bootcamp.aula4.LaChiqui.interfaces.IGuestFactory;

import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static IFireworkFactory fireworkFactory = new FireworkFactory();
    public static IGuestFactory guestFactory = new GuestFactory();

    public static void main(String[] args) {
        addGuests();
        guestFactory.printGuests();

        addFireworks();

        fireworkFactory.launch(1); // launch one package
        fireworkFactory.launch(); // launc all package
    }

    public static void addFireworks() {

        fireworkFactory.addPackage(new Firework(new UUID(0, 10), "Kabum"));
        fireworkFactory.addPackage(new Firework(new UUID(0, 10), "Pow"));

        var pack1 = new ArrayList<Firework>();
        pack1.add(new Firework(new UUID(0, 10), "Xablau"));
        fireworkFactory.addPackage(pack1);

        var pack2 = fireworkFactory.getPackage(0);
        pack2.add(new Firework(new UUID(0, 10), "Kabum2"));
        fireworkFactory.updatePackage(0, pack2);
    }

    public static void addGuests() {

        guestFactory.addGuest(new MeliGuest("Onias"));
        guestFactory.addGuest(new StandartGuest("Carol"));
        guestFactory.addGuest(new MeliGuest("Leo"));
        guestFactory.addGuest(new StandartGuest("Guh"));
    }
}
