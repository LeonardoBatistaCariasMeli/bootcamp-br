package com.digitalhouse.bootcamp.aula3;

public class Aula3 {


    public static Boolean isPrimo(int numero){

        //    Exercicio 3
        //Desenvolva um programa para informar se um um número n é primo ou não, sendo n um valor que o
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
}
