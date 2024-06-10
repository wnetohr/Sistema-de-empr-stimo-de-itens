package com.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.util.ItemAbstrato;

public class Usuario {

    //Atributos
    private String nome;
    private String cpf;
    protected List<ItemAbstrato> listaItens;

    //Construtor
    public Usuario() {
        this.listaItens = new ArrayList<>();
    }

    public Usuario(String nome, String cpf, List<ItemAbstrato> listaItens) {
        this.nome = nome;
        this.cpf = cpf;
        this.listaItens = listaItens;
    }

    //Funções
    public void cadastrar(Scanner sc) {
        System.out.println("Digite o nome do usuário: ");
        setNome(sc.nextLine());
        System.out.println("Digite o CPF do usuário: ");
        setCpf(sc.nextLine());
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<ItemAbstrato> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<ItemAbstrato> listaItens) {
        this.listaItens = listaItens;
    }

}
