
package br.thiagorodrigues.crud.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostResource {
 
    @JsonProperty("id_post")
    private String idPost;
    @JsonProperty("title_post")
    private String title;
    @JsonProperty("text_post")
    private String text;

    public PostResource(String idPost, String title, String text) {
        this.idPost = idPost;
        this.title = title;
        this.text = text;
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

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    
}
