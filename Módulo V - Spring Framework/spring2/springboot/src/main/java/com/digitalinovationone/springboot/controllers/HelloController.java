package com.digitalinovationone.springboot.controllers;

import com.digitalinovationone.springboot.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    PokemonService pokemonService;

    @GetMapping("/")
    public String hellomessage() {
        pokemonService.buscarPokemon();
        return "Hello, Digital Inovation One!";
    }



}
