package com.digitalhouse.bootcamp.aula4.Dakar;

public class Car extends Vehicle{
    public Car(double speed, double maximumSpeed, double acceleration, double turningAngle, String plate, int probabilityOfCrash) {
        super(speed, maximumSpeed, acceleration, turningAngle, plate, 1000, 4, probabilityOfCrash);
    }
}
