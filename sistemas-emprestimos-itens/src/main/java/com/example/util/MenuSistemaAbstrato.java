package com.example.util;

import java.util.Scanner;

import com.example.model.GestorEmprestimo;

public interface MenuSistemaAbstrato {
    //Atributos

    //Métodos
    public abstract void selecionarOpcao(GestorEmprestimo gestorEmprestimo, Scanner sc);

    public abstract void exibirOpcoes();

    public abstract void casdastroItem(GestorEmprestimo gestorEmprestimo, Scanner sc);

    public abstract void categoriasItem();

    public abstract void casdastroUsuario(GestorEmprestimo gestorEmprestimo, Scanner sc);

    public abstract void exibirItensDisponiveis(GestorEmprestimo gestorEmprestimo, Scanner sc);

    public abstract void exibirUsuarios();

    public abstract void sairDoMenu();
}
