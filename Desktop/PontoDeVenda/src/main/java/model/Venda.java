package model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gustavo H. Nava
 */
@Entity
@Getter
@Setter
public class Venda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String observacoes;
    
    private Date data;
    
    private BigDecimal total;
    
    @ManyToOne
    private int idCliente;

    public Venda() {
    }
    
}
