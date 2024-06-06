package br.unipar.pontodevenda.controller;

import br.unipar.pontodevenda.model.Cliente;
import br.unipar.pontodevenda.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteApiController {

    private final ClienteService clienteService;

    public ClienteApiController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping(path = "/api/cliente")
    public ResponseEntity<List<Cliente>> getAll() {
        return  ResponseEntity.ok(this.clienteService.getAll());
    }

    @PostMapping(path = "/api/cliente")
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(this.clienteService.save(cliente));
    }
}
