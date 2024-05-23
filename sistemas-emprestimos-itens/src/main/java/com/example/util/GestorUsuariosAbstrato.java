package com.example.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.model.Usuario;

public interface GestorUsuariosAbstrato {

    List<Usuario> listaUsuarios = new ArrayList<>();
    Map<Long, Usuario> mapaUsuarios = new HashMap<>();

    public abstract void cadastrarUsuario();

}
