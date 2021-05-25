package com.digitalhouse.bootcamp.aula4.Dakar;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private long distance;
    private double prizeDollars;
    private String name;
    private int limitOfVehicles;
    private List<Vehicle> vehiclesList = new ArrayList<>();

    public Race(long distance, double prizeDollars, String name, int limitOfVehicles) {
        this.distance = distance;
        this.prizeDollars = prizeDollars;
        this.name = name;
        this.limitOfVehicles = limitOfVehicles;
    }

    public void register (Vehicle vehicle){
        if (this.vehiclesList.size() <= this.limitOfVehicles){
            this.vehiclesList.add(vehicle);
        }
        else{
            System.out.println("Limit of vehicles achieved.");
        }
    }

    public void removeVehicle (Vehicle vehicle) {
        this.vehiclesList.remove(vehicle);
    }

    public void removeVehicleByPlate (String plate) {
        var vehicle = this.vehiclesList.stream().filter(v -> v.getPlate().equals(plate)).findFirst();
        if(vehicle.isPresent()){
            this.vehiclesList.remove(vehicle.get());
        }
        else{
            System.out.println("This plate doesn't exist.");
        }
    }
    
    public Vehicle findWinner (){
        Vehicle winner = null;
        double maxPoints = 0;
        for (var v: this.vehiclesList) {
            double points = (v.getSpeed() * v.getAcceleration()) / (v.getTurningAngle() * (v.getWeight() - v.getWheels() * 100));
            if(points > maxPoints) {
                maxPoints = points;
                winner = v;
            }
        }
        return winner;
    }

    public void printWinner () {
        var winner = this.findWinner();

        if(winner == null) {
            return;
        }
        System.out.println("Winner: " + winner.getPlate());
    }

    public double getRaceTime () {
        var winner = this.findWinner();

        if(winner == null) {
            return 0;
        }

        return (1/(winner.getSpeed() / this.distance));
    }
}