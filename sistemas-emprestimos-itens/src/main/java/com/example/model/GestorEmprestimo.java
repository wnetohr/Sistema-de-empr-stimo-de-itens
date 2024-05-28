package com.example.model;

import java.util.List;

import com.example.util.ItemAbstrato;

public class GestorEmprestimo {

    protected List<ItemAbstrato> itensDisponiveis;
    protected List<ItemAbstrato> itensEmprestados;

    public GestorEmprestimo(List<ItemAbstrato> itensDisponiveis, List<ItemAbstrato> itensEmprestados) {
        this.itensDisponiveis = itensDisponiveis;
        this.itensEmprestados = itensEmprestados;
    }

    public void emprestarItem(ItemAbstrato item, Usuario usuario) {
        if (itensDisponiveis.contains(item)) {
            usuario.adicionarItem(item);
        }
    }

    public void devolverItem(ItemAbstrato item, Usuario usuario) {
        if (usuario.listaItens.contains(item)) {
            usuario.removerItem(item);
        }
    }
}
