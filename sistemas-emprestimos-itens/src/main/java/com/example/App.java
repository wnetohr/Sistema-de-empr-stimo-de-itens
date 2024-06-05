package com.example;

import com.example.model.GestorEmprestimo;
import com.example.model.MenuSistema;

public class App {

    public static void main(String[] args) {
        GestorEmprestimo gestorEmprestimo = new GestorEmprestimo();
        MenuSistema menu = new MenuSistema();
        menu.selecionarOpcao(gestorEmprestimo);
    }
}
