package com.retofarmatodo.web.controller;

import com.retofarmatodo.service.serviceRickAndMorty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rinckandmortyOne")
public class PuntoUnoController {


    private serviceRickAndMorty serviceRickAndMorty;

    @GetMapping("{numEpisode}")
    public Object episode(@PathVariable("numEpisode") int numEpisode){
        RestTemplate plantilla= new RestTemplate();
        String url= "https://rickandmortyapi.com/api/episode/";
        url=url+numEpisode;
        Object resultado = plantilla.getForObject(url, String.class);
        System.out.println("Objeto :"+resultado.toString());
        return resultado;
    }

}
