package com.example.model;

import java.util.ArrayList;
import java.util.List;

import com.example.util.GestorEmprestimoAbstrato;
import com.example.util.ItemAbstrato;

public class GestorEmprestimo implements GestorEmprestimoAbstrato {

    protected List<ItemAbstrato> itensDisponiveis;
    protected List<ItemAbstrato> itensEmprestados;

    public GestorEmprestimo() {
        this.itensDisponiveis = new ArrayList<ItemAbstrato>();
        this.itensEmprestados = new ArrayList<ItemAbstrato>();
    }

    public GestorEmprestimo(List<ItemAbstrato> itensDisponiveis, List<ItemAbstrato> itensEmprestados) {
        this.itensDisponiveis = itensDisponiveis;
        this.itensEmprestados = itensEmprestados;
    }

    public void cadastrarProduto(ItemAbstrato item) {
        itensDisponiveis.add(item);
    }

    public void emprestarItem(ItemAbstrato item, Usuario usuario) {
        if (itensDisponiveis.contains(item)) {
            usuario.adicionarItem(item);
            itensDisponiveis.remove(item);
            itensEmprestados.add(item);
        }
    }

    public void devolverItem(ItemAbstrato item, Usuario usuario) {
        if (usuario.listaItens.contains(item)) {
            usuario.removerItem(item);
            itensDisponiveis.add(item);
            itensEmprestados.remove(item);
        }
    }

    public List<String> exibirNomeDosItens() {
        List<String> nomeItens = new ArrayList<String>();
        for (ItemAbstrato item : itensDisponiveis) {
            nomeItens.add(item.getNome());
        }
        return nomeItens;
    }
}
