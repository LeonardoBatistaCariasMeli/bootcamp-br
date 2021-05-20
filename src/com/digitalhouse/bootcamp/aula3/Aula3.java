package com.digitalhouse.bootcamp.aula3;

import java.util.Scanner;

public class Aula3 {

    private Scanner scanner;

    public Aula3(Scanner scanner) {
        this.scanner = scanner;
    }

    public void multipleNumbers() {

        // Exercicio 2
        // Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e m valores que o 
        // usuário irá inserir via console. Lembre-se que um número a é divisível por b se a é divisível por b.

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

    public static Boolean isPrimo(int numero){

        // Exercicio 3
        // Desenvolva um programa para informar se um um número n é primo ou não, sendo n um valor que o
        // usuário irá inserir pelo console. Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.


        boolean isPrimo = false;
        int resultado = 0;

        for(int i = 2; i<=numero / 2; i++){
            if(numero % i == 0){
                resultado++;
                break;
            }
        }

        if(resultado == 0){
            isPrimo = true;
        }

        return isPrimo;
    }

    public static int exercicio1(){
        Scanner scanner = new Scanner(System.in);

        int size =  scanner.nextInt();

        if(size == 0){
            System.out.println("nenhum numero par");
        }else if(size < 0){
            System.out.println("numero ínvalido");
        }else{
            int count  = 0;
            for(int i = 0; count < size; i++){
                if( ( i & 1 ) == 0){
                    System.out.println("" + i);
                    count++;
                }
            }            
            System.out.println("Finalizado");
        }
        return 0;
        
    }
}
