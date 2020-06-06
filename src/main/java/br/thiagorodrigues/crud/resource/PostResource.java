
package br.thiagorodrigues.crud.resource;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PostResource {

    @JsonProperty("")
    private String idPost;
    private String cliente;
    private String plano;
    private String endereço;
    private String telefone;

    public PostResource(String idPost, String cliente, String plano, String endereço, String telefone) {
        this.idPost = idPost;
        this.cliente = cliente;
        this.plano = plano;
        this.endereço = endereço;
        this.telefone = telefone;
    }


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the idPost
     */
    public String getIdPost() {
        return idPost;
    }

    /**
     * @param idPost the idPost to set
     */
    public void setIdPost(String idPost) {
        this.idPost = idPost;
    }



}
