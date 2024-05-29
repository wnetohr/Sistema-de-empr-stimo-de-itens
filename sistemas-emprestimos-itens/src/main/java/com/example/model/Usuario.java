package com.example.model;

import java.util.List;

import com.example.util.ItemAbstrato;

public class Usuario {

    //Atributos
    private String nome;
    private int cpf;
    protected  List<ItemAbstrato> listaItens;

    //Construtor
    public Usuario(){}

    public Usuario(String nome, int cpf, List<ItemAbstrato> listaItens) {
        this.nome = nome;
        this.cpf = cpf;
        this.listaItens = listaItens;
    }

    //Funções
    public void adicionarItem(ItemAbstrato item) {
        listaItens.add(item);
    }

    public void removerItem(ItemAbstrato item) {
        listaItens.remove(item);
    }
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
