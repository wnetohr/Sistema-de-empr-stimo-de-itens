package com.example.util;

public interface ItemAbstrato {

    int getQuantidadeDisponivel();

    void setQuantidadeDisponivel(int quantidade);

    void emprestar();

    void devolver();

    String getNome();
}
