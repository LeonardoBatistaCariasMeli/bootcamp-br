package com.digitalhouse.bootcamp.aula4.Dakar;

public class Vehicle {
    private double speed;
    private double acceleration;
    private double turningAngle;
    private String plate;
    private double weight;
    private int wheels;

    public Vehicle(double speed, double acceleration, double turningAngle, String plate, double weight, int wheels) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.turningAngle = turningAngle;
        this.plate = plate;
        this.weight = weight;
        this.wheels = wheels;
    }

    public double getSpeed() {
        return speed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getTurningAngle() {
        return turningAngle;
    }

    public String getPlate() {
        return plate;
    }

    public double getWeight() {
        return weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public void setTurningAngle(double turningAngle) {
        this.turningAngle = turningAngle;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
