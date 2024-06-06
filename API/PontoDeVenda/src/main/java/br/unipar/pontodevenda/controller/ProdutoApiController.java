package br.unipar.pontodevenda.controller;

import br.unipar.pontodevenda.model.Produto;
import br.unipar.pontodevenda.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoApiController {

    private final ProdutoService produtoService;

    public ProdutoApiController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping(path = "/api/produto")
    public ResponseEntity<List<Produto>> getAll(){
        return ResponseEntity.ok(this.produtoService.getAll());
    }

    @PostMapping(path = "/api/produto")
    public ResponseEntity<Produto> save(@RequestBody Produto produto) {
        return ResponseEntity.ok(this.produtoService.save(produto));
    }
}
