package com.example.model;

import com.example.util.ItemAbstrato;

public class Filmes implements ItemAbstrato {

    //Atributos
    String nome;
    String descricao;
    String diretor;
    int duracaoEmMinutos;

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

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
