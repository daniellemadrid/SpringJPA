package com.example.SpringDataImovel.repository;

import com.example.SpringDataImovel.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Iterable<Usuario> findAll();
}
