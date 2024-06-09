package model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Gustavo H. Nava
 */
@Getter
@Setter
public class Cliente {
    
    private Integer id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Cliente() {
    }
    
}
