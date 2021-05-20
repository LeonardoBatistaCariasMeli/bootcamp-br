package com.digitalhouse.bootcamp.aula3;

import java.util.Scanner;

public class Aula3 {

    private Scanner scanner;

    public Aula3(Scanner scanner) {
        this.scanner = scanner;
    }

    public void Exercicio2() {
        System.out.print("Insira um número múltiplo: ");
        int m = scanner.nextInt();
        System.out.print("Insira uma quantidade de números: ");
        int n = scanner.nextInt();

        System.out.println("");

        int i = 1;
        do
        {
            if (i % m == 0) {
                System.out.print(i);
                System.out.print("\t");
                n--;
            }

            i++;
        } while (n > 0);
    }

}
