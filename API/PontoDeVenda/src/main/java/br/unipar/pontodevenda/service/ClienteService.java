package br.unipar.pontodevenda.service;

import br.unipar.pontodevenda.model.Cliente;
import br.unipar.pontodevenda.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getAll() {
        return this.clienteRepository.findAll();
    }

    public Cliente save(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    public Cliente validarCliente(Integer id, String cpf) {
        return this.clienteRepository.findByIdAndCpf(id, cpf);
    }

}
