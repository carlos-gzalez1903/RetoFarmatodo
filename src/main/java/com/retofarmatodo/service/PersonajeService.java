package com.retofarmatodo.service;

import com.retofarmatodo.persistence.entity.Personaje;
import com.retofarmatodo.persistence.repository.PersonajeRepository;
import com.retofarmatodo.persistence.repository.UbicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonajeService {
    @Autowired
    private PersonajeRepository personajeRepository;
    @Autowired
    private UbicacionRepository ubicacionRepository;


    public List<Personaje> getAll(){
        List<Personaje> personajes = (List<Personaje>) personajeRepository.findAll();
        return personajes;
    }

    public Optional<Personaje> getById(int idPersonaje){
        return personajeRepository.findById(idPersonaje);
    }

    public Personaje save(Personaje personaje){
        /*int ubicacionId = personaje.getUbicacionId();
        Ubicacion ubicacion = ubicacionRepository.findById(ubicacionId).get();
        Personaje person = new Personaje();
        Personaje personaje1 = personajeRepository.save(person);
        return personaje1;*/
        return personajeRepository.save(personaje);
    }

}
