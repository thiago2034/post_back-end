
package br.thiagorodrigues.crud.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "post")
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name ="Cliente")
    private String cliente;

    @Column(name = "Plano")
    private String Plano;


    @Column(name = "Endereço")
    private String Endereço;

    @Column(name = "Telefone")
    private String Telefone;

    public String getEndereço() {
        return Endereço;
    }
    public String getPlano() {
        return Plano;
    }

    public void setPlano(String plano) {
        Plano = plano;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }



    public PostModel(){

    }
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return cliente;
    }

    public void setTitle(String cliente) {
        this.cliente = cliente;
    }

    
}
