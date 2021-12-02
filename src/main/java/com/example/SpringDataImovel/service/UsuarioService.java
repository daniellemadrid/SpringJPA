package com.example.SpringDataImovel.service;


import com.example.SpringDataImovel.model.Imovel;
import com.example.SpringDataImovel.model.TipoUsuario;
import com.example.SpringDataImovel.model.Usuario;
import com.example.SpringDataImovel.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UsuarioService {
    @Autowired
    private final UsuarioRepository usuarioRepository;

    public void cadastrarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public Iterable<Usuario> buscarUsuarios() {
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> getId(long id) {
        return usuarioRepository.findById(id);
    }

}


