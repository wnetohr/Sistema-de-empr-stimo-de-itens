package com.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.example.util.ItemAbstrato;

public class GestorUsuarios {

    private List<Usuario> listaUsuarios = new ArrayList<>();
    private Map<Long, Usuario> mapaUsuarios = new HashMap<>();
    private Set<Long> idsUtilizados = new HashSet<>();
    private long proximoId = 1;

    public GestorUsuarios() {
    }

    public GestorUsuarios(List<Usuario> listaUsuarios, Map<Long, Usuario> mapaUsuarios) {
        this.listaUsuarios = listaUsuarios;
        this.mapaUsuarios = mapaUsuarios;
    }

    public Usuario buscaUsuario(String cpfDoCliente) {
        try {
            for (Usuario usuario : listaUsuarios) {
                if (usuario.getCpf().equals(cpfDoCliente)) {
                    return usuario;
                }
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<String> ExibirNomeDosUsuarios() {
        List<String> nomeUsuarios = new ArrayList<String>();
        for (Usuario usuario : listaUsuarios) {
            nomeUsuarios.add(usuario.getNome());
        }
        return nomeUsuarios;
    }

    public void adicionarUsuarioNaLista(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void cadastrarUsuario(Usuario usuario) {
        long id = proximoId++;
        adicionarUsuarioNaLista(usuario);
        mapaUsuarios.put(id, usuario);
        idsUtilizados.add(id);
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Map<Long, Usuario> getMapaUsuarios() {
        return mapaUsuarios;
    }

    public void setMapaUsuarios(Map<Long, Usuario> mapaUsuarios) {
        this.mapaUsuarios = mapaUsuarios;
    }

}
