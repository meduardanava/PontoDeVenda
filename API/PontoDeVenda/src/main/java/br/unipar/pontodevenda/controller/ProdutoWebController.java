package br.unipar.pontodevenda.controller;

import br.unipar.pontodevenda.model.Produto;
import br.unipar.pontodevenda.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProdutoWebController {

    private final ProdutoService produtoService;

    public ProdutoWebController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping(path = "/produtos")
    public String getAllProduto(Model model){
        List<Produto>produtos = produtoService.getAll();
        model.addAttribute("produtos", produtos);
        return "produtos";
    }

    @PostMapping(path = "/produtos/save")
    public String saveProduto(Produto produto) {
        produtoService.save(produto);
        return "redirect:/produtos";
    }
}
