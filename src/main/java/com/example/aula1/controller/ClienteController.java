package com.example.aula1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping
    public String buscarCliente(@RequestParam String nome, @RequestParam String cidade) {
        return "Buscando cliente com nome " + nome + " da cidade " + cidade;
    }
}
