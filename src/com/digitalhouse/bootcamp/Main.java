package com.digitalhouse.bootcamp;

import com.digitalhouse.bootcamp.aula3.Aula3;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Aula3 aula3 = new Aula3(scanner);
        
        // Exercicio 1
        Aula3.exercicio1();

        // Exercicio 2
        aula3.multipleNumbers();
        System.out.println("\n");

        // Exercicio 3
        aula3.isPrimo(5);
        System.out.println("\n");

        // Exercicio 4
        aula3.primeNumbers();
        System.out.println("\n");

        // Exercicio 5
        aula3.exercicio5();
        System.out.println("");

    }
}