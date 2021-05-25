package com.digitalhouse.bootcamp.aula4.LaChiqui.domains;

import com.digitalhouse.bootcamp.aula4.LaChiqui.enums.GuestType;

public class StandartGuest extends Guest {

    public StandartGuest(String name) {
        super(GuestType.STANDART, name);
    }

    @Override
    public void eatCake() {
        super.eatCake();
    }
}
