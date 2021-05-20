package com.digitalhouse.bootcamp;

import com.digitalhouse.bootcamp.aula3.Aula3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aula3 aula3 = new Aula3(scanner);

        // Exercicio 2
        aula3.multipleNumbers();

        // Exercicio 3
        System.out.println(Aula3.isPrimo(5));

        // Exercicio 4
        aula3.primeNumbers();
    }
}
