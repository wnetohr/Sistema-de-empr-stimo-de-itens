package com.example;

import java.util.Scanner;

import com.example.model.GestorEmprestimo;
import com.example.model.MenuSistema;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorEmprestimo gestorEmprestimo = new GestorEmprestimo();
        MenuSistema menu = new MenuSistema();
        menu.selecionarOpcao(gestorEmprestimo, sc);
        sc.close();
    }
}
