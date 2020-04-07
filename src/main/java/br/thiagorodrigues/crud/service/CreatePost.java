
package br.thiagorodrigues.crud.service;

import br.thiagorodrigues.crud.model.PostModel;
import br.thiagorodrigues.crud.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class CreatePost {
    @Autowired
    private PostRepository postRespository;
    
   public void create (PostModel post){
       
       postRespository.saveAndFlush(post);
  
   }
    
}
