package com.digitalhouse.bootcamp.aula4.Dakar;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Race race = new Race (500000, 1000000, "Maluca Crazy", 4);
        Car car1 = new Car (97.2, 0.0007, 35, "ABC1234");
        Car car2 = new Car (69.4, 0.0015, 24, "DEF5678");
        Motorcycle moto1 = new Motorcycle(83.3, 0.0012, 36, "MFS2387");
        Motorcycle moto2 = new Motorcycle(77.7, 0.00096, 35, "MAS2377");

        race.register(car1);
        race.register(car2);
        race.register(moto1);
        race.register(moto2);

        Safety<Car> safetyCar = new Safety<Car>();
        safetyCar.help(car2);

        race.printWinner();
        DecimalFormat df = new DecimalFormat("####0.00");
        System.out.println("Value: " + (df.format(race.getRaceTime()/60)) + " minutes");
    }
}
