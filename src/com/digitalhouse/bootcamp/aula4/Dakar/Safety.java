package com.digitalhouse.bootcamp.aula4.Dakar;

import java.util.Random;

public class Safety<T extends  Vehicle>{
    private T type;

    public Boolean help (T t){
        System.out.println("Helping " + t.getClass().getSimpleName() + " Plate " + t.getPlate());
        Random r = new Random();
        double probability = r.nextDouble()*100;
        if (probability < 30) {
            return false;
        }
        return true;
    }
}
