package com.retofarmatodo.service;

import com.retofarmatodo.persistence.entity.Episodio;
import com.retofarmatodo.persistence.entity.Ubicacion;
import com.retofarmatodo.persistence.repository.UbicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UbicacionService {

    @Autowired
    private UbicacionRepository ubicacionRepository;

    public List<Ubicacion> getAll(){
        List<Ubicacion> ubicaciones = (List<Ubicacion>) ubicacionRepository.findAll();
        return  ubicaciones;
    }

    public Optional<Ubicacion> getById(int idUbicacion){
        return ubicacionRepository.findById(idUbicacion);
    }

    public Ubicacion save(Ubicacion ubicacion){
        Ubicacion ubicacion1 = ubicacionRepository.save(ubicacion);
        return ubicacion1;
    }

}
