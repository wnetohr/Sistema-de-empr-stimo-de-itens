package com.example.model;

import java.util.Scanner;

import com.example.util.ItemAbstrato;

public class Equipamentos implements ItemAbstrato {

    //Atributos
    String nome;
    String descricao;
    String fabricante;
    String especificacaoTecnica;
    int quantidadeDisponivel;

    //Construtor
    public Equipamentos() {
    }

    //Funções
    public void cadastrar(Scanner sc) {
        System.out.println("Digite o nome do equipamento: ");
        this.nome = sc.nextLine();
        System.out.println("Digite a descrição do equipamento: ");
        this.descricao = sc.nextLine();
        System.out.println("Digite o fabricante do equipamento: ");
        this.fabricante = sc.nextLine();
        System.out.println("Digite as especificações técnicas do equipamento: ");
        this.especificacaoTecnica = sc.nextLine();
        System.out.println("Digite a quantidade de equipamentos a serem cadastrados: ");
        this.quantidadeDisponivel = sc.nextInt();
        sc.nextLine();
    }

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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getEspecificacaoTecnica() {
        return especificacaoTecnica;
    }

    public void setEspecificacaoTecnica(String especificacaoTecnica) {
        this.especificacaoTecnica = especificacaoTecnica;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}
