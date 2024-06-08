package model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gustavo H. Nava
 */
@Getter
@Setter
public class Venda {
    
    private int id;
    private String observacoes;
    private Date data;
    private BigDecimal total;
    private int idCliente;

    public Venda() {
    }
    
}
