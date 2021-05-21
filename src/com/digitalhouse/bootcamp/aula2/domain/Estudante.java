package com.digitalhouse.bootcamp.aula2.domain;

// Aula 2 - Exercicio 1
public class Estudante {
    private String nome;
    private int idade;
    private String matricula;
    private String serie;

    public Estudante(String nome, int idade, String matricula, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
