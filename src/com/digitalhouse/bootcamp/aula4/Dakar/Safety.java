package com.digitalhouse.bootcamp.aula4.Dakar;

public class Safety<T extends  Vehicle>{
    private T type;

    public void help (T t){
        System.out.println("Helping " + t.getClass().getSimpleName() + " Plate: " + t.getPlate());
    }
}
