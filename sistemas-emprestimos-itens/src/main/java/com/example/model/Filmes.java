package com.example.model;

import java.util.Scanner;

import com.example.util.ItemAbstrato;

public class Filmes implements ItemAbstrato {

    //Atributos
    String nome;
    String descricao;
    String diretor;
    String genero;
    int duracaoEmMinutos;
    int quantidadeDisponivel;
    //Construtor
    public Filmes(){}
    //Funções
    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        this.nome = sc.nextLine();
        System.out.println("Digite a descrição do filme: ");
        this.descricao = sc.nextLine();
        System.out.println("Digite o nome do diretor(a) do filme: ");
        this.diretor = sc.nextLine();
        System.out.println("Digite o gênero do filme: ");
        this.genero = sc.nextLine();
        System.out.println("Digite a duração em minutos do filme: ");
        this.duracaoEmMinutos = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a quantidade de filmes a serem cadastrados: ");
        this.quantidadeDisponivel = sc.nextInt();
        sc.nextLine();
        sc.close();
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

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
