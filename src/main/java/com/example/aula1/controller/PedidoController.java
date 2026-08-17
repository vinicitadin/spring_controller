package com.example.aula1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @GetMapping
    public ResponseEntity<String> listarPedidos() {
        return ResponseEntity.ok("Listando todos os pedidos");
    }

    @PostMapping
    public ResponseEntity<String> criarPedido(@RequestBody String pedido) {
        return ResponseEntity.ok("Recebendo novo pedido: " + pedido);
    }
}

