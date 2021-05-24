package com.digitalhouse.bootcamp.aula3.exercicio2;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        var arrayStrings = new ArrayList<String>();
        arrayStrings.add("Zebra");
        arrayStrings.add("Abacate");
        arrayStrings.add("Banana");

        var arrayInteger = new ArrayList<Integer>();
        arrayInteger.add(1000);
        arrayInteger.add(100);
        arrayInteger.add(10000);
        arrayInteger.add(4500);
        arrayInteger.add(456);
        arrayInteger.add(12);

        var stringTimer = new Timer();
        var intTimer = new Timer();

        var sorter = SorterFactory.create();
        if(sorter == null)return;

        stringTimer.start();
        var sortedArrayStrings =  sorter.sort(arrayStrings,String::compareTo);
        stringTimer.end();
        intTimer.start();
        var sortedArrayInteger = sorter.sort(arrayInteger,Integer::compareTo);
        intTimer.end();

        System.out.println("Sorte Integer");
        System.out.println("Original : " + arrayInteger);
        System.out.println("Sorted : " + sortedArrayInteger);
        System.out.println("Duration Time : "+intTimer.getElapsedTime()  + "ms" );

        System.out.println("\nSorte String");
        System.out.println("Original : " + arrayStrings);
        System.out.println("Sorted : " + sortedArrayStrings);
        System.out.println("Duration Time : "+stringTimer.getElapsedTime()  + "ms" );






    }
}
