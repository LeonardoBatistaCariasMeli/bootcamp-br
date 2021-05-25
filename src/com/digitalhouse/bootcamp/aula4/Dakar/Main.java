package com.digitalhouse.bootcamp.aula4.Dakar;

public class Main {
    public static void main(String[] args) {
        Race race = new Race (500000, 1000000, "Maluca Crazy", 15, 10);
        Car car1 = new Car (97.2, 100, 0.0007, 35, "ABC1234", 5);
        Car car2 = new Car (69.4, 100, 0.0014, 24, "DEF5678", 6);
        Car car3 = new Car (80.4, 100, 0.002, 34, "SAL5908", 10);
        Car car4 = new Car (73.4, 100, 0.0021, 32, "PSF3467", 5);
        Car car5 = new Car (65.4, 100, 0.0019, 45, "XDC2649", 9);
        Car car6 = new Car (78.4, 100, 0.0014, 23, "WED6789", 2);
        Motorcycle moto1 = new Motorcycle(83.3, 100, 0.0012, 36, "MFS2387", 4);
        Motorcycle moto2 = new Motorcycle(98.7, 100, 0.0016, 40, "MAS2377", 7);
        Motorcycle moto3 = new Motorcycle(94.7, 100, 0.00098, 32, "HSQ2367", 3);
        Motorcycle moto4 = new Motorcycle(71.7, 100, 0.0023, 43, "PLS2977", 9);
        Motorcycle moto5 = new Motorcycle(64.7, 100, 0.0019, 35, "CAR9977", 12);

        race.register(car1);
        race.register(car2);
        race.register(car3);
        race.register(car4);
        race.register(car5);
        race.register(car6);
        race.register(moto1);
        race.register(moto2);
        race.register(moto3);
        race.register(moto4);
        race.register(moto5);

        race.run();
    }
}
