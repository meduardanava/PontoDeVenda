package br.unipar.pontodevenda.service;

import br.unipar.pontodevenda.model.Produto;
import br.unipar.pontodevenda.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> getAll() {
        return this.produtoRepository.findAll();
    }

    public Produto save(Produto produto) {
        return this.produtoRepository.save(produto);
    }

    public Produto validarProduto(Integer id, Integer codBarras) {
        return this.produtoRepository.findByIdAndAndCodBarras(id, codBarras);
    }

}
