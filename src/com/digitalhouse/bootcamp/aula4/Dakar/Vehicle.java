package com.digitalhouse.bootcamp.aula4.Dakar;

public class Vehicle {
    private double speed;
    private double maximumSpeed;
    private double acceleration;
    private double turningAngle;
    private String plate;
    private double weight;
    private int wheels;
    private int probabilityOfCrash;

    public Vehicle(double speed, double maximumSpeed, double acceleration, double turningAngle, String plate, double weight, int wheels, int probabilityOfCrash) {
        this.speed = speed;
        this.maximumSpeed = maximumSpeed;
        this.acceleration = acceleration;
        this.turningAngle = turningAngle;
        this.plate = plate;
        this.weight = weight;
        this.wheels = wheels;
        this.probabilityOfCrash = probabilityOfCrash;
    }

    public double getTime (double distance) {
        double x_1  = ((-1)*this.speed + Math.sqrt(Math.pow(this.speed,2) + 2*this.acceleration*distance))/this.acceleration;
        double x_2  = ((-1)*this.speed - Math.sqrt(Math.pow(this.speed,2) + 2*this.acceleration*distance))/this.acceleration;
        if (x_1 < 0){
            return x_2;
        }
        else{
            return x_1;
        }
    }

    public void accelerate (double distance) {
        double seconds = this.getTime(distance);
        double newSpeed = this.speed + seconds*this.acceleration;
        if (newSpeed < this.maximumSpeed){
            this.setSpeed(newSpeed);
        }
    }

    public void increaseProbabilityOfCrash () {
        this.probabilityOfCrash += this.probabilityOfCrash*0.10;
    }

    public void decreaseAcceleration () {
        this.acceleration = this.acceleration*0.95;
    }

    public void setProbabilityOfCrash(int probabilityOfCrash) {
        this.probabilityOfCrash = probabilityOfCrash;
    }

    public int getProbabilityOfCrash() {
        return probabilityOfCrash;
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
