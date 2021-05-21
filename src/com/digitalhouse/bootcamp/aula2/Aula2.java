package com.digitalhouse.bootcamp.aula2;

import com.digitalhouse.bootcamp.aula2.domain.Book;
import com.digitalhouse.bootcamp.aula2.domain.Disciplina;
import com.digitalhouse.bootcamp.aula2.domain.Estudante;
import com.digitalhouse.bootcamp.aula2.domain.Turma;

public class Aula2 {

    public static void main(String[] args) {
        // Aula 2 - Exercicio 1
        createTurma();

        // Aual 2 - Exercicio 2.3
        var book = new Book("Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia");
        System.out.println(book);
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
}
