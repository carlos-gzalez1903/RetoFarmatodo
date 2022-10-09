package com.retofarmatodo.service;


import com.retofarmatodo.persistence.entity.Episodio;
import com.retofarmatodo.persistence.repository.EpisodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodioService {

    @Autowired
    private EpisodioRepository episodioRepository;

    public List<Episodio> getAll(){
        List<Episodio> episodios = (List<Episodio>) episodioRepository.findAll();
        return  episodios;
    }



}
