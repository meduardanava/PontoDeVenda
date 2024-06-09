package model;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gustavo H. Nava
 */
@Getter
@Setter
public class ItemVenda {
    
    private int id;
    private int quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;
    private int idVenda;
    private int idProduto;

    public ItemVenda() {
    }
    
}
