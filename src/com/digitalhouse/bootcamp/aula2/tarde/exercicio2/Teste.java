package com.digitalhouse.bootcamp.aula2.tarde.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        Circle circle = new Circle( 4);
        Square square = new Square( 4);
        Triangle triangle = new Triangle(4);

        System.out.println(square.area());
        System.out.println(triangle.area());
        System.out.println(circle.area());

        List<GeometricFigure> arrayOfFigures = new ArrayList<>();

        arrayOfFigures.add(circle);
        arrayOfFigures.add(square);
        arrayOfFigures.add(triangle);

        System.out.println( GeometricCalculator.avarage(arrayOfFigures));


    }
}
