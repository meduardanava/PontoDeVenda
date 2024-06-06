package br.unipar.pontodevenda.service;

import br.unipar.pontodevenda.model.Venda;
import br.unipar.pontodevenda.repository.VendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    private final VendaRepository vendaRepository;

    public VendaService(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    public List<Venda> getAll() {
        return this.vendaRepository.findAll();
    }

    public Venda save(Venda venda) {
        return this.vendaRepository.save(venda);
    }

    public Venda validarVenda(Integer id, String observacoes) {
        return this.vendaRepository.findByIdAndObservacoes(id, observacoes);
    }

}
