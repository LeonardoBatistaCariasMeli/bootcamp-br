package com.digitalhouse.bootcamp;

import com.digitalhouse.bootcamp.aula3.Aula1;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Aula1 aula1 = new Aula1(scanner);

        exercisesFirstDay(aula1);

        aula1.orderByAscAndDesc();
    }

    public static void exercisesFirstDay(Aula1 aula1) {
        // Exercicio 1
        System.out.println("Exercício 1");
        aula1.exercicio1();
        System.out.println("\n");

        // Exercicio 2
        System.out.println("Exercício 2");
        aula1.multipleNumbers();
        System.out.println("\n");

        // Exercicio 3
        System.out.println("Exercício 3");
        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();
        System.out.println(aula1.isPrimo(numero) + "\n");

        // Exercicio 4
        System.out.println("Exercício 4");
        aula1.primeNumbers();
        System.out.println("\n");

        // Exercicio 5
        System.out.println("Exercício 5");
        aula1.firstPrimeNumberValuesWithConditions();
        System.out.println("");
    }
}