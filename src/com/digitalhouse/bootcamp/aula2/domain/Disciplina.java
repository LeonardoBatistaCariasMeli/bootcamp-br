package com.digitalhouse.bootcamp.aula2.domain;

// Aula 2 - Exercicio 1
public class Disciplina {
    private String nome;
    private double cargaHoraria;

    public Disciplina(String nome, double cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
