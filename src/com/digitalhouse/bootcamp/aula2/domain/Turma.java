package com.digitalhouse.bootcamp.aula2.domain;

import java.util.ArrayList;
import java.util.List;

// Aula 2 - Exercicio 1
public class Turma {
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Estudante> estudantes = new ArrayList<>();
    private String serie;
    private String identificador;

    public Turma(String serie, String identificador) {
        this.serie = serie;
        this.identificador = identificador;
    }

    public void addDiscplina (Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public void addEstudante (Estudante estudante){
        this.estudantes.add(estudante);
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public String getSerie() {
        return serie;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void printDisciplinas () {
        System.out.println("Disciplinas: ");
       this.disciplinas.forEach(disciplina -> {
           System.out.println(disciplina.getNome() + " - " + disciplina.getCargaHoraria() + "h");
            }
        );
    }

    public void printEstudantes () {
        System.out.println("Estudantes: ");
        this.estudantes.forEach(estudante -> {
                    System.out.println(estudante.getNome());
                }
        );
    }

    public void printTurma () {
        System.out.println(
                "Série: " + this.serie + " - " + this.identificador
        );
        this.printDisciplinas();
        this.printEstudantes();
    }
}
