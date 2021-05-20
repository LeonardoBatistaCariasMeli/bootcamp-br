package com.digitalhouse.bootcamp;

import com.digitalhouse.bootcamp.aula3.Aula1;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Aula1 aula1 = new Aula1(scanner);

        //aula1.runAllExercises();

        aula1.orderByAscAndDesc();
    }
}