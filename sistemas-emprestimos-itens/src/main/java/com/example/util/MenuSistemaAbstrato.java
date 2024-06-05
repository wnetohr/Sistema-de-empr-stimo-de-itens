package com.example.util;

import com.example.model.GestorEmprestimo;

public interface MenuSistemaAbstrato {
    //Atributos

    //Métodos
    public abstract void selecionarOpcao(GestorEmprestimo gestorEmprestimo);
    public abstract void exibirOpcoes();
    public abstract void casdastroItem(GestorEmprestimo gestorEmprestimo);
    public abstract void categoriasItem();
    public abstract void casdastroUsuario();
    public abstract void exibirItensDisponiveis(GestorEmprestimo gestorEmprestimo);
    public abstract void exibirUsuarios();
    public abstract void sairDoMenu();
}