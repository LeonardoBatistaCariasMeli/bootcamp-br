package com.digitalhouse.bootcamp;

import com.digitalhouse.bootcamp.aula3.Aula3;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Aula3 aula3 = new Aula3(scanner);

        aula3.orderByAscAndDesc();

    }
}