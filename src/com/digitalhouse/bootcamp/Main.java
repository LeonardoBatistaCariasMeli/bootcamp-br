package com.digitalhouse.bootcamp;

import com.digitalhouse.bootcamp.aula3.Aula3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aula3 aula3 = new Aula3(scanner);

        // Exercicio 2
        aula3.multipleNumbers();
        System.out.println("\n");

        // Exercicio 3
        aula3.isPrimo();
        System.out.println("\n");

        // Exercicio 4
        aula3.primeNumbers();
        System.out.println("\n");
    }
}
