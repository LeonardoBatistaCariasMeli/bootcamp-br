package com.digitalhouse.bootcamp.aula4.Dakar;

public class Motorcycle extends Vehicle{
    public Motorcycle(double speed, double maximumSpeed, double acceleration, double turningAngle, String plate, int probabilityOfCrash) {
        super(speed, maximumSpeed, acceleration, turningAngle, plate, 300, 2, probabilityOfCrash);
    }
}
