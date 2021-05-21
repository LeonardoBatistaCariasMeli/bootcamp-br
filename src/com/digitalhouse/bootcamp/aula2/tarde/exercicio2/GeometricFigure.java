package com.digitalhouse.bootcamp.aula2.tarde.exercicio2;

public abstract class GeometricFigure {
    public abstract double area();

    @Override
    public String toString() {
        return Double.toString(area());
    }
}
