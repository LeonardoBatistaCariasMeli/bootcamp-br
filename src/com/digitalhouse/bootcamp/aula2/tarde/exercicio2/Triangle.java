package com.digitalhouse.bootcamp.aula2.tarde.exercicio2;

public class Triangle extends GeometricFigure {
    private double sideSize;

    public Triangle(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double area() {
        return (Math.pow(sideSize,2)* Math.sqrt(3))/4;
    }
}
