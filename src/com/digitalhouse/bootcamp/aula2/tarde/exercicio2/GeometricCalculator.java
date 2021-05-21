package com.digitalhouse.bootcamp.aula2.tarde.exercicio2;

import java.util.List;

public class GeometricCalculator {
    public static double avarage(List<GeometricFigure> arrayOfFigures) {
        int sumOfArea = 0 ;
        for(GeometricFigure cur : arrayOfFigures) {
            sumOfArea += cur.area();
        }
        return  sumOfArea / arrayOfFigures.size();
    }
}
