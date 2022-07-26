package org.gabrielffguimaraes.test.service;

import org.gabrielffguimaraes.test.model.Produto;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    public Produto salvarProduto(Produto p) {
        p.setId(1l);
        return p;
    }
}
