package com.example.SpringDataImovel.controller;

import com.example.SpringDataImovel.model.Imovel;
import com.example.SpringDataImovel.model.TipoImovel;
import com.example.SpringDataImovel.service.ImovelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/imoveis")

public class ImovelController {
    @Autowired
    private final ImovelService imovelService;

    @PostMapping
    public ResponseEntity save(@RequestBody Imovel imovel) {
        imovelService.save(imovel);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public Iterable<Imovel> todosImoveis() {
        return imovelService.getAll();
    }

    @GetMapping("/tipo")
    public List<Imovel> buscarTipo(@RequestParam TipoImovel tipoImovel){
        return  imovelService.tipoImovel(tipoImovel);
    }

}

