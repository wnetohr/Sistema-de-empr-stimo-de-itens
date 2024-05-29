package com.example.model;

import java.util.Scanner;

import com.example.util.ItemAbstrato;

public class Livros implements ItemAbstrato {

    //Atributos
    String nome;
    String descricao;
    String autor;
    int numeroPaginas;
    int quantidadeDisponivel;

    //Construtores
    public Livros(){}
    
    public Livros(String nome, String descricao,String autor, int numeroPaginas, int quantidadeDisponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    //Funções
    public void cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        this.nome = sc.nextLine();
        System.out.println("Digite a descrição do livro: ");
        this.descricao = sc.nextLine();
        System.out.println("Digite o nome do autor do livro: ");
        this.autor = sc.nextLine();
        System.out.println("Digite o número de páginas do livro: ");
        this.numeroPaginas = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a quantidade de livros: ");
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

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}
