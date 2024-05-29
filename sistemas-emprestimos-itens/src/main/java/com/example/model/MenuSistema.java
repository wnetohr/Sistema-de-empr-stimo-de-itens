package com.example.model;

import java.util.Scanner;

import com.example.util.MenuSistemaAbstrato;

public class MenuSistema implements MenuSistemaAbstrato {
    //Atributos

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

    public void selecionarOpcao() {
        Scanner sc = new Scanner(System.in);
        exibirOpcoes();
        String opcao = sc.nextLine();
        switch (opcao) {
            case "1":
                casdastroItem();
                break;
            case "2":
                casdastroUsuario();
                break;
            case "3":
                exibirItensDisponiveis();
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

    public void casdastroItem() {
        Scanner sc = new Scanner(System.in);
        categoriasItem();
        String categoria = sc.nextLine();
        switch (categoria) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                selecionarOpcao();
                break;

        }
        sc.close();
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

    public void exibirItensDisponiveis() {
    }

    public void exibirUsuarios() {
    }

    public void sairDoMenu() {
    }

}
