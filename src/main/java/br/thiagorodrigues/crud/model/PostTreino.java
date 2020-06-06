package br.thiagorodrigues.crud.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Treino")
public class PostTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private PostModel postModel;

    @Column(name = "Superior")
    private String superior;

    @Column(name = "inferior")
    private String inferior;

    @Column(name = "Posterior")
    private String posterior;


    public PostTreino() {

    }

    public PostModel getPostModel() {
        return postModel;
    }

    public void setPostModel(PostModel postModel) {
        this.postModel = postModel;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }

    public String getInferior() {
        return inferior;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setInferior(String inferior) {
        this.inferior = inferior;
    }

    public String getPosterior() {
        return posterior;
    }

    public void setPosterior(String posterior) {
        this.posterior = posterior;
    }


}
