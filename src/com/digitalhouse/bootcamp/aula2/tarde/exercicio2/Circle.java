package com.digitalhouse.bootcamp.aula2.tarde.exercicio2;

public class Circle extends GeometricFigure {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI*Math.pow(radius,2);
    }
}
