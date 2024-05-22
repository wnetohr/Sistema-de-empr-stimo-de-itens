package com.example.model;

import com.example.util.ItemAbstrato;

public class Livros implements ItemAbstrato {

    //Atributos
    String nome;
    String descricao;
    String autor;
    int numeroPaginas;

    //Construtores
    public Livros(String nome, String descricao, int numeroPaginas) {
        this.nome = nome;
        this.descricao = descricao;
        this.numeroPaginas = numeroPaginas;
    }

    //Funções
    public void emprestar() {
    }

    public void devolver() {
    }

    //Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
