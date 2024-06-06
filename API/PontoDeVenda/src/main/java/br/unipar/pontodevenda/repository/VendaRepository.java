package br.unipar.pontodevenda.repository;

import br.unipar.pontodevenda.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {

    Venda findByIdAndObservacoes(Integer id, String observacoes);
}
