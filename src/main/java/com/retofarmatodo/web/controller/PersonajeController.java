package com.retofarmatodo.web.controller;

import com.retofarmatodo.persistence.entity.Personaje;
import com.retofarmatodo.persistence.entity.PersonajeClass;
import com.retofarmatodo.persistence.entity.Ubicacion;
import com.retofarmatodo.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping("/all")
    public List<Personaje> getAll(){
        return personajeService.getAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Personaje> getById(@PathVariable("id") int idPersonaje){
        return personajeService.getById(idPersonaje);
    }

    @PostMapping("/save")
    public Personaje save(@RequestBody Personaje personaje){

        return personajeService.save(personaje);
    }

}
