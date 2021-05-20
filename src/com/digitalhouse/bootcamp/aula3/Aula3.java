package com.digitalhouse.bootcamp.aula3;

import java.util.Arrays;
import java.util.Scanner;

public class Aula3 {

    private Scanner scanner;

    public Aula3(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printArray() {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        array = orderBy(array);

        for (int a : array) {
            System.out.print(a);
            System.out.print("\t");
        }

        System.out.println();

        array = orderByDesc(array);

        for (int a : array) {
            System.out.print(a);
            System.out.print("\t");
        }
    }

    private Integer[] orderBy(Integer[] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array[i] > array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    private Integer[] orderByDesc(Integer[] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {

                if (array[i] < array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
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

    public static void exercicio1(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int size = scanner.nextInt();

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
    }
    public void primeNumbers() {

        // Exercicio 4
        // Desenvolva um programa para mostrar por console os primeiros n números primos,
        // sendo n um valor que o usuário irá inserir pelo console.

        System.out.print("Insira um número: ");
        int n = scanner.nextInt();

        int i = 0,
            j = 1;

        while( i < n ) {
            if(isPrimo(j)){
                System.out.println(j);
                i++;
            }
            j++;
        }
    }

    public void firstPrimeNumberValuesWithConditions() {
        System.out.println("Digite a quantidade de vezes que os números naturais devem aparecer");
        int n = scanner.nextInt();
        System.out.println("Digite qual o número que deve aparecer");
        int d = scanner.nextInt();
        System.out.println("Digite a quantidade minima de digitos que os numeros devem ter");
        int m = scanner.nextInt();

        findOccurrenceValues(n, m, d);
    }

    private void findOccurrenceValues(int n, int m, int d) {
        int ocorrencias = 0;
        for(int numeroAtual = 0; ocorrencias < n; numeroAtual++) {
            if(isCurrentNumberValid(numeroAtual, m, d)) {
                System.out.println(numeroAtual);
                ocorrencias++;
            }
        }
    }

    private boolean isCurrentNumberValid(int numeroAtual, int m, int d) {
        int ocorrenciaDoNumero = 0;
        String valorAtual = String.valueOf(numeroAtual);
        String[] valorAtualDivido = valorAtual.split("");

        if(!isCurrentNumberLengthValid(valorAtualDivido, m))
            return false;

        for(String valor : valorAtualDivido) {
            if(valor.equals(String.valueOf(d))) {
            ocorrenciaDoNumero++;
            }
        }
        return ocorrenciaDoNumero >= m;
    }

    private boolean isCurrentNumberLengthValid(String[] numeroAtualDivido, int m) {
        return numeroAtualDivido.length > m-1;
    }
}