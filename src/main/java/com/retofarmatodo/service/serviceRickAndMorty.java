package com.retofarmatodo.service;

import com.retofarmatodo.persistence.entity.Episode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class serviceRickAndMorty {

    //private int numEpisode;
    private WebClient webClient;

    public WebClient serviceOne(WebClient.Builder buider){
        //numEpisode=episode;
        webClient = buider.baseUrl("https://rickandmortyapi.com/api/episode/").build();

        return webClient;
    }

}
