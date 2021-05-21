package com.digitalhouse.bootcamp.aula2;

import java.util.ArrayList;

import com.digitalhouse.bootcamp.aula2.domain.Book;
import com.digitalhouse.bootcamp.aula2.domain.ContaCorrente;
import com.digitalhouse.bootcamp.aula2.domain.Counter;
import com.digitalhouse.bootcamp.aula2.domain.Disciplina;
import com.digitalhouse.bootcamp.aula2.domain.Estudante;
import com.digitalhouse.bootcamp.aula2.domain.Turma;

public class Aula2 {

	public static final ArrayList<Book> books = new ArrayList<>();

	public static void main(String[] args) {
		// Aula 2 - Exercicio 1
		createTurma();
		System.out.println();

		// Aula 2 - Exercicio 2.1
		runSecondListExercise1();

		// Aula 2 - Exercicio 2.2
		runSecondListExercise2();

		// Aula 2 - Exxercicio 2.3
		createBooks();
	}

	public static void createTurma() {
		Disciplina disciplina1 = new Disciplina("Matemática", 4.0);
		Disciplina disciplina2 = new Disciplina("Geografia", 3.0);
		Estudante estudante1 = new Estudante("Josué", 15, "1003", "4C");
		Estudante estudante2 = new Estudante("Camila", 16, "1005", "4C");
		Turma turma = new Turma("4", "C");

		turma.addDiscplina(disciplina1);
		turma.addDiscplina(disciplina2);
		turma.addEstudante(estudante1);
		turma.addEstudante(estudante2);

		turma.printTurma();
	}

	private static void runSecondListExercise1() {
		var contaCorrente1 = new ContaCorrente(1000.00);
		contaCorrente1.total();
		contaCorrente1.deposit(100);
		contaCorrente1.withDraw(100);
		contaCorrente1.devolution(100);
		contaCorrente1.transfer(100);

		var contaCorrente2 = new ContaCorrente(contaCorrente1);
		contaCorrente2.total();
		System.out.println();
	}

	public static void runSecondListExercise2() {
		var counter = new Counter();
		counter.increase();
		counter.printActualValue();
		counter.decrease();
		counter.printActualValue();
		counter.increase();
		System.out.println();

		var counter2 = new Counter(counter);
		counter2.printActualValue();
		counter2.increase();
		counter2.printActualValue();
		System.out.println();

		var counter3 = new Counter(10);
		counter3.decrease();
		counter3.printActualValue();
		System.out.println();

	}

	public static void createBooks() {
		// Aual 2 - Exercicio 2.3
		var book1 = new Book("Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia");
		var book2 = new Book("A Lenda dos Guardiões", "Kathryn Lasky", "Aventura");
		var book3 = new Book("Percy Jackson e os Olimpianos", "Rick Riordan", "Fantasia e Mitologia");

		book1.emprestimo();

		books.add(book1);
		books.add(book2);
		books.add(book3);

		for (var book : books) {
			System.out.println(book);
		}
	}
}