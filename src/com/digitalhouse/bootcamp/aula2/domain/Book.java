package com.digitalhouse.bootcamp.aula2.domain;

import java.util.concurrent.ThreadLocalRandom;

// Aula 2 - Exercicio 2.3
public class Book {

    private int id;
    private String titulo;
    private String autor;
    private String genero;

    public Book() {
    }

    public Book(String titulo, String autor, String genero) {
        this.id = ThreadLocalRandom.current().nextInt(1, 1000000);
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Classe Book\n" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'';
    }
}
