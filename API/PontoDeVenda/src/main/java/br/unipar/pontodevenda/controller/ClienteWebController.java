package br.unipar.pontodevenda.controller;

import br.unipar.pontodevenda.model.Cliente;
import br.unipar.pontodevenda.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClienteWebController {

    private final ClienteService clienteService;

    public ClienteWebController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping(path = "/clientes")
    public String getAllCliente(Model model) {
        List<Cliente> clientes = clienteService.getAll();
        model.addAttribute("clientes", clientes);
        return "clientes";
    }

    @PostMapping(path = "/clientes/save")
    public String saveCliente(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/clientes";
    }



}
