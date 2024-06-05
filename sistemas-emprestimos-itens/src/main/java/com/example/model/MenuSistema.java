package com.example.model;

import java.util.Scanner;

import com.example.util.MenuSistemaAbstrato;

public class MenuSistema implements MenuSistemaAbstrato {

    //Construtor
    public MenuSistema() {
    }

    //Métodos
    @Override
    public void exibirOpcoes() {
        System.out.println("----- Menu -----");
        System.out.println("1. Cadastrar produto");
        System.out.println("2. Cadastrar usuário");
        System.out.println("3. Exibir itens disponíveis");
        System.out.println("4. Exibir usuários");
        System.out.println("5. Sair do sistema");
        System.out.println("----------------");
        System.out.println("Digite o número da opção deseja: ");
    }

    public void selecionarOpcao(GestorEmprestimo gestorEmprestimo) {
        Scanner sc = new Scanner(System.in);
        exibirOpcoes();
        String opcao = sc.nextLine();
        switch (opcao) {
            case "1":
                casdastroItem(gestorEmprestimo);
                break;
            case "2":
                casdastroUsuario();
                break;
            case "3":
                exibirItensDisponiveis(gestorEmprestimo);
                break;
            case "4":
                exibirUsuarios();
                break;
            case "5":
                sairDoMenu();
                break;
        }
        sc.close();
    }

    public void casdastroItem(GestorEmprestimo gestorEmprestimo) {
        Scanner sc = new Scanner(System.in);
        //GestorEmprestimo gestorEmprestimo = new GestorEmprestimo();
        categoriasItem();
        String categoria = sc.nextLine();
        switch (categoria) {
            case "1":
                Equipamentos equipamento = new Equipamentos();
                equipamento.cadastrar();
                gestorEmprestimo.cadastrarProduto(equipamento);
                break;
            case "2":
                Filmes filme = new Filmes();
                filme.cadastrar();
                gestorEmprestimo.cadastrarProduto(filme);
                break;
            case "3":
                Jogos jogo = new Jogos();
                jogo.cadastrar();
                gestorEmprestimo.cadastrarProduto(jogo);
                break;
            case "4":
                Livros livro = new Livros();
                livro.cadastrar();
                gestorEmprestimo.cadastrarProduto(livro);
                break;
            case "5":
                selecionarOpcao(gestorEmprestimo);
                break;

        }
        sc.close();
        selecionarOpcao(gestorEmprestimo);

    }

    public void categoriasItem() {
        System.out.println("----- Categorias -----");
        System.out.println("1. Equipamento");
        System.out.println("2. Filmes");
        System.out.println("3. Jogos");
        System.out.println("4. Livros");
        System.out.println("5. Sair");
        System.out.println("----------------");
        System.out.println("Digite o número da opção deseja: ");
    }

    public void casdastroUsuario() {
    }

    public void exibirItensDisponiveis(GestorEmprestimo gestorEmprestimo) {
        System.out.println(gestorEmprestimo.itensDisponiveis);
    }

    public void exibirUsuarios() {
    }

    public void sairDoMenu() {
    }

}
