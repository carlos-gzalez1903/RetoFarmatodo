package com.retofarmatodo.web.controller;

import com.retofarmatodo.persistence.entity.Ubicacion;
import com.retofarmatodo.service.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ubicacion")
public class UbicacionController {

    @Autowired
    private UbicacionService ubicacionService;

    @GetMapping("/all")
    public List<Ubicacion> getAll(){
        return ubicacionService.getAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Ubicacion> getById(@PathVariable("id") int idUbicacion){
        return ubicacionService.getById(idUbicacion);
    }

    @PostMapping("/save")
    public Ubicacion save(@RequestBody Ubicacion ubicacion){
        return ubicacionService.save(ubicacion);
    }

}
