package com.example.util;
import java.util.List;

import com.example.model.Usuario;

public abstract class GestorEmprestimoAbstrato {
    protected List<ItemAbstrato> itensDisponiveis;
    protected List<ItemAbstrato> itensEmprestados;

    public abstract void emprestarItem(ItemAbstrato item, Usuario usuario);
    public abstract void devolverItem(ItemAbstrato item, Usuario usuario);
}