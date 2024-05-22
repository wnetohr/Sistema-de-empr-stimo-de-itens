package com.example.model;

import java.util.List;

import com.example.util.ItemAbstrato;

public class Usuario {

    //Atributos
    String nome;
    int cpf;
    List<ItemAbstrato> listaItens;

    //Construtor
    public Usuario(String nome, int cpf, List<ItemAbstrato> listaItens) {
        this.nome = nome;
        this.cpf = cpf;
        this.listaItens = listaItens;
    }

    //Funções

    //Get e Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public List<ItemAbstrato> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<ItemAbstrato> listaItens) {
        this.listaItens = listaItens;
    }

}
