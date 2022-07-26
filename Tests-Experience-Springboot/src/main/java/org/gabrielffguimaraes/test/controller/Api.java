package org.gabrielffguimaraes.test.controller;

import org.gabrielffguimaraes.test.model.Produto;
import org.gabrielffguimaraes.test.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/produto")
    public ResponseEntity<Produto> salvar(@RequestBody Produto p) {

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.salvarProduto(p));
    }
}
