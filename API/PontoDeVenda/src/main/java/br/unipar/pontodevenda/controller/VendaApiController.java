package br.unipar.pontodevenda.controller;

import br.unipar.pontodevenda.model.Venda;
import br.unipar.pontodevenda.service.VendaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendaApiController {

    private final VendaService vendaService;

    public VendaApiController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    @GetMapping(path = "/api/venda")
    public ResponseEntity<List<Venda>> getAll(){
        return ResponseEntity.ok(this.vendaService.getAll());
    }

    @PostMapping(path = "/api/venda")
    public ResponseEntity<Venda> save(@RequestBody Venda venda) {
        return ResponseEntity.ok(this.vendaService.save(venda));
    }

}
