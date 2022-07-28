package com.digitalinovationone.springboot.service;

import com.digitalinovationone.springboot.classes.PokemonApi;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    public void buscarPokemon() {
        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();

        PokemonApi pokemonApi = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon", PokemonApi.class);

        System.out.println();
    }
}
