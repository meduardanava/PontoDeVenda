package model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gustavo H. Nava
 */
@Entity
@Getter
@Setter
public class ItemVenda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private int quantidade;
    
    private BigDecimal valorUnitario;
    
    private BigDecimal valorTotal;
    
    @ManyToOne
    private int idVenda;
    
    @ManyToOne
    private int idProduto;

    public ItemVenda() {
    }
    
}
