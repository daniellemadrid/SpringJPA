package com.example.SpringDataImovel.service;

import com.example.SpringDataImovel.model.Imovel;
import com.example.SpringDataImovel.model.TipoImovel;
import com.example.SpringDataImovel.repository.ImovelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ImovelService {

    @Autowired
    private final ImovelRepository imovelRepository;

    public void save(Imovel imovel) {
        imovelRepository.save(imovel);

    }

    public Iterable<Imovel> getAll() {
        return imovelRepository.findAll();
    }

    public List<Imovel> tipoImovel(TipoImovel tipoImovel) {
        return imovelRepository.findByTipoImovel(tipoImovel);

    }
}