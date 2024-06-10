package com.example.util;

import java.util.Scanner;

import com.example.model.GestorEmprestimo;
import com.example.model.GestorUsuarios;

public interface MenuSistemaAbstrato {
    //Atributos

    //Métodos
    public abstract void selecionarOpcao(GestorEmprestimo gestorEmprestimo,GestorUsuarios gestorUsuarios, Scanner sc);

    public abstract void exibirOpcoes();

    public abstract void cadastroItem(GestorEmprestimo gestorEmprestimo, GestorUsuarios gestorUsuarios, Scanner sc);

    public abstract void categoriasItem();

    public abstract void cadastroUsuario(GestorEmprestimo gestorEmprestimo,GestorUsuarios gestorUsuarios, Scanner sc);

    public abstract void exibirItensDisponiveis(GestorEmprestimo gestorEmprestimo, GestorUsuarios gestorUsuarios, Scanner sc);

    public abstract void exibirUsuarios(GestorEmprestimo gestorEmprestimo,GestorUsuarios gestorUsuarios, Scanner sc);

    public abstract void sairDoMenu();
}
