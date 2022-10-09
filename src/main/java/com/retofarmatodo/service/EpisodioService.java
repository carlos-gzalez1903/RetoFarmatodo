package com.retofarmatodo.service;


import com.retofarmatodo.persistence.entity.Episodio;
import com.retofarmatodo.persistence.repository.EpisodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodioService {

    @Autowired
    private EpisodioRepository episodioRepository;

    public List<Episodio> getAll(){
        List<Episodio> episodios = (List<Episodio>) episodioRepository.findAll();
        return  episodios;
    }

    public Optional<Episodio> getById(int idEpisodio){
        return episodioRepository.findById(idEpisodio);
    }

    public Episodio save(Episodio episodio){
        Episodio episodio1 = episodioRepository.save(episodio);
        return episodio1;
    }



}
