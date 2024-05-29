package com.example.model;

import java.util.Scanner;

import com.example.util.ItemAbstrato;

public class Jogos implements ItemAbstrato {

    //Atributos
    String nome;
    String descricao;
    String desenvolvedora;
    String genero;
    String plataforma;
    int quantidadeDisponivel;

    //Construtor
    public Jogos() {
    }

    //Funções
    public void cadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do jogo: ");
        this.nome = sc.nextLine();
        System.out.println("Digite a descrição do jogo: ");
        this.descricao = sc.nextLine();
        System.out.println("Digite a desenvolvedora do jogo: ");
        this.descricao = sc.nextLine();
        System.out.println("Digite o gênero do jogo: ");
        this.genero = sc.nextLine();
        System.out.println("Digite a plataforma do jogo: ");
        this.plataforma = sc.nextLine();
        System.out.println("Digite a quantidade de jogos: ");
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

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
