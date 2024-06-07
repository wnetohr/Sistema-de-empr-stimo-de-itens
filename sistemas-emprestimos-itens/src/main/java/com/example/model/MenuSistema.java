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

    public void selecionarOpcao(GestorEmprestimo gestorEmprestimo, Scanner sc) {
        exibirOpcoes();
        String opcao = sc.nextLine();
        switch (opcao) {
            case "1":
                casdastroItem(gestorEmprestimo, sc);
                break;
            case "2":
                casdastroUsuario(gestorEmprestimo, sc);
                break;
            case "3":
                exibirItensDisponiveis(gestorEmprestimo, sc);
                break;
            case "4":
                exibirUsuarios();
                break;
            case "5":
                sairDoMenu();
                break;
        }
    }

    public void casdastroItem(GestorEmprestimo gestorEmprestimo, Scanner sc) {
        categoriasItem();
        String categoria = sc.nextLine();
        switch (categoria) {
            case "1":
                Equipamentos equipamento = new Equipamentos();
                equipamento.cadastrar(sc);
                gestorEmprestimo.cadastrarProduto(equipamento);
                break;
            case "2":
                Filmes filme = new Filmes();
                filme.cadastrar(sc);
                gestorEmprestimo.cadastrarProduto(filme);
                break;
            case "3":
                Jogos jogo = new Jogos();
                jogo.cadastrar(sc);
                gestorEmprestimo.cadastrarProduto(jogo);
                break;
            case "4":
                Livros livro = new Livros();
                livro.cadastrar(sc);
                gestorEmprestimo.cadastrarProduto(livro);
                break;
            case "5":
                selecionarOpcao(gestorEmprestimo, sc);
                break;

        }
        selecionarOpcao(gestorEmprestimo, sc);

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

    public void casdastroUsuario(GestorEmprestimo gestorEmprestimo, Scanner sc) {
        Usuario usuario = new Usuario();
        usuario.cadastrar(sc);
        selecionarOpcao(gestorEmprestimo, sc);
    }

    public void exibirItensDisponiveis(GestorEmprestimo gestorEmprestimo, Scanner sc) {
        System.out.println(gestorEmprestimo.exibirNomeDosItens());
        selecionarOpcao(gestorEmprestimo, sc);
    }

    public void exibirUsuarios() {
    }

    public void sairDoMenu() {
    }

}
