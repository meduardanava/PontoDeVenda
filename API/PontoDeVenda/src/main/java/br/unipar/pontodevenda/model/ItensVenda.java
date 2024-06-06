package br.unipar.pontodevenda.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class ItensVenda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantidade;

    private BigDecimal valorUnitario;

    private BigDecimal valorTotal;

    @ManyToOne
    private Venda venda;

    @ManyToOne
    private Produto produto;

}
