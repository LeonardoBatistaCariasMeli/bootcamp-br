package com.digitalhouse.bootcamp.aula4.LaChiqui.factories;

import com.digitalhouse.bootcamp.aula4.LaChiqui.domains.Guest;
import com.digitalhouse.bootcamp.aula4.LaChiqui.interfaces.IGuestFactory;

import java.util.ArrayList;
import java.util.List;

public class GuestFactory implements IGuestFactory {

    List<Guest> guests = new ArrayList<>();


    @Override
    public void addGuest(Guest guest) {

        this.guests.add(guest);
    }

    @Override
    public void printGuests() {

        for (var guest : guests) {
            guest.eatCake();
        }
    }
}
