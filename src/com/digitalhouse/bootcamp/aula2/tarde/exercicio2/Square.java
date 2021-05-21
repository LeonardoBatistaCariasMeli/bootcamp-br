package com.digitalhouse.bootcamp.aula2.tarde.exercicio2;

public class Square extends GeometricFigure {
    private double sideSize;

    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double area() {
        return Math.pow(sideSize,2);
    }
}
