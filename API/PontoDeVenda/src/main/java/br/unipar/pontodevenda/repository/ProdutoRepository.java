package br.unipar.pontodevenda.repository;

import br.unipar.pontodevenda.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    Produto findByIdAndAndCodBarras(Integer id, Integer codBarras);
}
