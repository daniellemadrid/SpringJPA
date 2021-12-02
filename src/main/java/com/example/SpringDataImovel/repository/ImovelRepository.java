package com.example.SpringDataImovel.repository;

import com.example.SpringDataImovel.model.Imovel;
import com.example.SpringDataImovel.model.TipoImovel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ImovelRepository extends CrudRepository<Imovel, Long> {

    List<Imovel> findByTipoImovel(TipoImovel tipoImovel);
}
