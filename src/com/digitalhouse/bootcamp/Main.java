package com.digitalhouse.bootcamp;

import java.util.Scanner;

import com.digitalhouse.bootcamp.aula1.Aula1;

public class Main {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Aula1 aula1 = new Aula1(scanner);

		// aula1.runAllExercises();
		aula1.readProductsAndPrint();

	}
}