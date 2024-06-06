package br.unipar.pontodevenda.controller;

import br.unipar.pontodevenda.model.Venda;
import br.unipar.pontodevenda.service.VendaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class VendaWebController {

    private final VendaService vendaService;

    public VendaWebController(VendaService vendaService) {
        this.vendaService = vendaService;
    }

    @GetMapping(path = "/vendas")
    public String getAllVenda(Model model) {
        List<Venda> vendas =vendaService.getAll();
        model.addAttribute("vendas", vendas);
        return "vendas";
    }

    @PostMapping(path = "/vendas")
    public String saveVenda(Venda venda) {
        vendaService.save(venda);
        return "redirect:/vendas";
    }

}
