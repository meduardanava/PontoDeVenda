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
    
    private Integer id;
    private Integer codBarras;
    private String descricao;
    private BigDecimal valor;
    private String categoria;

    public Produto() {
    }
    
}
