package com.example.aula1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<String> listarProdutos() {
        return ResponseEntity.ok("Listagem de Produtos");
    }

    @PostMapping
    public ResponseEntity<String> criarProduto(@RequestBody String produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Produto foi criado");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarProduto(@PathVariable Long id, @RequestBody String produtoAtualizado) {
        return ResponseEntity.ok("Atualizando produto ID " + id + " para: " + produtoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarProduto(@PathVariable Long id)
    {
        return ResponseEntity.ok("Produto com ID " + id + " deletado com sucesso");
    }
}
