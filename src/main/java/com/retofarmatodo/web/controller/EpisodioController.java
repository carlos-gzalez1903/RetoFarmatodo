package com.retofarmatodo.web.controller;

import com.retofarmatodo.persistence.entity.Episodio;
import com.retofarmatodo.service.EpisodioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/episodio")
public class EpisodioController {

    @Autowired
    private EpisodioService episodioService;

    @GetMapping("/all")
    public List<Episodio> getAll(){
        return episodioService.getAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Episodio> getById(@PathVariable("id") int idEpisodio){
        return episodioService.getById(idEpisodio);
    }

    @PostMapping("/save")
    public Episodio save(@RequestBody Episodio episodio){
        return episodioService.save(episodio);
    }



}
