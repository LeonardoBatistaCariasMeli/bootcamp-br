package com.digitalhouse.bootcamp.aula2;

import com.digitalhouse.bootcamp.aula2.domain.Book;
import com.digitalhouse.bootcamp.aula2.domain.Disciplina;
import com.digitalhouse.bootcamp.aula2.domain.Estudante;
import com.digitalhouse.bootcamp.aula2.domain.Turma;

import java.util.ArrayList;

public class Aula2 {

    public static final ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        // Aula 2 - Exercicio 1
        createTurma();

        System.out.println();

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
