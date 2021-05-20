package com.digitalhouse.bootcamp;

import com.digitalhouse.bootcamp.aula3.Aula3;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Aula3 aula3 = new Aula3(scanner);
        
        // Exercicio 1
        System.out.println("Exercício 1");
        Aula3.exercicio1();
        System.out.println("\n");

        // Exercicio 2
        System.out.println("Exercício 2");
        aula3.multipleNumbers();
        System.out.println("\n");

        // Exercicio 3
        System.out.println("Exercício 3");
        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();
        System.out.println(Aula3.isPrimo(numero) + "\n");

        // Exercicio 4
        System.out.println("Exercício 4");
        aula3.primeNumbers();
        System.out.println("\n");

        // Exercicio 5
        System.out.println("Exercício 5");
        aula3.firstPrimeNumberValuesWithConditions();
        System.out.println("");

    }
}