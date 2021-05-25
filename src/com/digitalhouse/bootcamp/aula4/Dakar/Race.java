package com.digitalhouse.bootcamp.aula4.Dakar;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Race {
    private long distance;
    private double prizeDollars;
    private String name;
    private int limitOfVehicles;
    private List<Vehicle> vehiclesList = new ArrayList<>();
    private int laps;

    public Race(long distance, double prizeDollars, String name, int limitOfVehicles, int laps) {
        this.distance = distance;
        this.prizeDollars = prizeDollars;
        this.name = name;
        this.limitOfVehicles = limitOfVehicles;
        this.laps = laps;
    }

    public void register (Vehicle vehicle){
        if (this.vehiclesList.size() <= this.limitOfVehicles){
            this.vehiclesList.add(vehicle);
        }
        else{
            System.out.println("Limit of vehicles achieved.");
        }
    }

//    public void removeVehicle (Vehicle vehicle) {
//        this.vehiclesList.remove(vehicle);
//        System.out.println(vehicle.getClass().getSimpleName() + " Plate " + vehicle.getPlate() + " removed.");
//    }
//
//    public void removeVehicleByPlate (String plate) {
//        var vehicle = this.vehiclesList.stream().filter(v -> v.getPlate().equals(plate)).findFirst();
//        if(vehicle.isPresent()){
//            this.vehiclesList.remove(vehicle.get());
//            System.out.println(vehicle.getClass().getSimpleName() + " Plate " + plate + " removed.");
//        }
//        else{
//            System.out.println("This plate doesn't exist.");
//        }
//    }

    public void run () {
        System.out.println("Start race!");
        for(int i = 0; i < this.laps; i++){
            System.out.println("Lap " + (i+1));

            if(this.vehiclesList.isEmpty()){
                System.out.println("Nobody survived.");
                break;
            }
            this.accelerateAllVehicles();
            this.checkBreaks();
        }
        this.printEndOfRace();
    }

    public void accelerateAllVehicles () {
        double distancePerLap = this.distance/this.laps;
        for(var vehicle : this.vehiclesList) {
            vehicle.accelerate(distancePerLap);
        }
    }

    public void checkBreaks () {
        Random r = new Random();

        for(Iterator<Vehicle> iter = this.vehiclesList.iterator(); iter.hasNext();) {
//        for(var vehicle : this.vehiclesList) {
            Vehicle vehicle = iter.next();
            double probability = r.nextDouble()*100;
            if(probability < vehicle.getProbabilityOfCrash() ){
                Boolean isGonnaContinue = true;
                if(vehicle instanceof Car){
                    Safety<Car> safetyCar = new Safety<Car>();
                    isGonnaContinue = safetyCar.help((Car) vehicle);
                }
                else if(vehicle instanceof Motorcycle){
                    Safety<Motorcycle> safetyCar = new Safety<Motorcycle>();
                    isGonnaContinue = safetyCar.help((Motorcycle) vehicle);
                }

                vehicle.decreaseAcceleration();
                vehicle.increaseProbabilityOfCrash();

                if (!isGonnaContinue) {
                    //this.removeVehicle(vehicle);
                    iter.remove();
                    System.out.println(vehicle.getClass().getSimpleName()+ " Plate " + vehicle.getPlate() + " removed.");
                }
                else{
                    System.out.println(vehicle.getClass().getSimpleName()+ " Plate " + vehicle.getPlate() + " returned to race.");
                }
            }
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

    public void printEndOfRace () {
        var winner = this.findWinner();

        if(winner == null) {
            return;
        }

        DecimalFormat df = new DecimalFormat("####0.00");
        System.out.println("Race finished.");
        System.out.println(
                "Winner: " + winner.getClass().getSimpleName() + " Plate " + winner.getPlate() + "\n" +
                "Final Speed of Winner: " + df.format(winner.getSpeed())
        );
    }

    public double getRaceTime (Vehicle winner) {

        if(winner == null) {
            return 0;
        }

        return (1/(winner.getSpeed() / this.distance));
    }
}