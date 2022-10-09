package com.retofarmatodo.web.controller;

import com.retofarmatodo.persistence.entity.Personaje;
import com.retofarmatodo.persistence.repository.PersonajeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {

    private PersonajeRepository personajeRepository;


    @PostMapping("/save")
    public Object save(@RequestBody Personaje personaje){

        return personajeRepository.save(personaje);
    }

}
