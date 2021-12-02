package com.example.SpringDataImovel.controller;


import com.example.SpringDataImovel.model.Usuario;
import com.example.SpringDataImovel.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuarios")

public class UsuarioController{
    @Autowired
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity save(@RequestBody Usuario usuario) {
        usuarioService.cadastrarUsuario(usuario);
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @GetMapping
    public Iterable<Usuario> buscarTodos() {
        return  usuarioService.buscarUsuarios();
    }
    @GetMapping("/{id}")
    public Optional<Usuario> getId(@PathVariable(required = true) long id) {
        return usuarioService.getId(id);

    }
}
