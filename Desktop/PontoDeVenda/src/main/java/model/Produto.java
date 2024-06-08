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
public class Produto {
    
    private int id;
    private String descricao;
    private BigDecimal valor;
    private String categoria;

    public Produto() {
    }
    
}
