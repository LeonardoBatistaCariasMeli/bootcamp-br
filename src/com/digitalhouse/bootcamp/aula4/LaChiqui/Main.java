package com.digitalhouse.bootcamp.aula4.LaChiqui;

import com.digitalhouse.bootcamp.aula4.LaChiqui.domains.Firework;
import com.digitalhouse.bootcamp.aula4.LaChiqui.domains.Guest;
import com.digitalhouse.bootcamp.aula4.LaChiqui.enums.GuestType;
import com.digitalhouse.bootcamp.aula4.LaChiqui.factories.FireworkFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Guest guest1 = new Guest(GuestType.STANDART, "Onias");
        Guest guest2 = new Guest(GuestType.MELI, "Carol");
        Guest guest3 = new Guest(GuestType.STANDART, "Leo");
        Guest guest4 = new Guest(GuestType.MELI, "Guh");

        List<Guest> guests = Arrays.asList(guest1, guest2, guest3, guest4);

        FireworkFactory factory = new FireworkFactory();
        factory.addPackage(new Firework(new UUID(0, 10), "Kabum"));
        factory.addPackage(new Firework(new UUID(0, 10), "Pow"));

        var pack1 = new ArrayList<Firework>();
        pack1.add(new Firework(new UUID(0, 10), "Xablau"));
        factory.addPackage(pack1);

        var pack2 = factory.getPackage(0);
        pack2.add(new Firework(new UUID(0, 10), "Kabum2"));
        factory.updatePackage(0, pack2);

        for (var guest : guests) {

            guest.eatCake();
        }

        factory.launch(1);

        factory.launch();
    }
}
