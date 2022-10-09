package com.retofarmatodo.web.controller;

import com.retofarmatodo.persistence.entity.Episodio;
import com.retofarmatodo.service.EpisodioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/episodio")
public class EpisodioController {

    @Autowired
    private EpisodioService episodioService;

    @GetMapping("/all")
    public List<Episodio> getAll(){
        return episodioService.getAll();
    }

}
