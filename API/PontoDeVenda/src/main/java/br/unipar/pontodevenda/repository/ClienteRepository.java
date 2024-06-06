package br.unipar.pontodevenda.repository;

import br.unipar.pontodevenda.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    Cliente findByIdAndNome(Integer id, String nome);
}
