package com.example;

import java.util.Scanner;

import com.example.model.GestorEmprestimo;
import com.example.model.GestorUsuarios;
import com.example.model.MenuSistema;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorEmprestimo gestorEmprestimo = new GestorEmprestimo();
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        MenuSistema menu = new MenuSistema();
        menu.selecionarOpcao(gestorEmprestimo, gestorUsuarios, sc);
        sc.close();
    }
}
