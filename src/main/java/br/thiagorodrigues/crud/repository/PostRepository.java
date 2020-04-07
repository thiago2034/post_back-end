
package br.thiagorodrigues.crud.repository;

import br.thiagorodrigues.crud.model.PostModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostModel, Long> {
}
