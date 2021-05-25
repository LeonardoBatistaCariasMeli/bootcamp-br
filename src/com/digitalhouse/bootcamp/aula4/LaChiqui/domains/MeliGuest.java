package com.digitalhouse.bootcamp.aula4.LaChiqui.domains;

import com.digitalhouse.bootcamp.aula4.LaChiqui.enums.GuestType;

public class MeliGuest extends Guest {

    public MeliGuest(String name) {
        super(GuestType.MELI, name);
    }

    @Override
    public void eatCake() {
        super.eatCake();
        System.out.println("“Viva la Chiqui!!");
    }
}
