package com.retofarmatodo.web.controller;

import com.retofarmatodo.service.serviceRickAndMorty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rinckandmortyOne")
public class PuntoUno {

    @Autowired
    private serviceRickAndMorty serviceRickAndMorty;



}
