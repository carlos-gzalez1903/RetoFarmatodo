package com.retofarmatodo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class serviceRickAndMorty {

    //private int numEpisode;

    public String getEpisode(int numEpisode){

        RestTemplate plantilla= new RestTemplate();
        String resultado = plantilla.getForObject("https://rickandmortyapi.com/api/episode/"+numEpisode, String.class);
        System.out.println(resultado);

        /*Object provinciaVo = webClient.get().uri("/"+numEpisode).
                retrieve().bodyToMono(Object.class).
                block();*/
        return resultado;
    }

}
