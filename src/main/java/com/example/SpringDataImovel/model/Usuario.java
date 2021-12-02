package com.example.SpringDataImovel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity

public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String user;
    private String senha;
    private TipoUsuario tipoUsuario;
}
