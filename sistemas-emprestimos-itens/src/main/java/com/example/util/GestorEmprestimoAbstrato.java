package com.example.util;

import com.example.model.Usuario;

public interface GestorEmprestimoAbstrato {
    public abstract void emprestarItem(ItemAbstrato item, Usuario usuario);
    public abstract void devolverItem(ItemAbstrato item, Usuario usuario);
    public abstract void cadastrarProduto(ItemAbstrato item);
}