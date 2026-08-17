package com.example.aula1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @GetMapping("/{id}")
    public String buscarPorId(@PathVariable Long id) { return "Venda com ID: " + id; }

    @PostMapping
    public ResponseEntity<String> criarVenda(@RequestBody String venda) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Venda foi criada");
    }
}
