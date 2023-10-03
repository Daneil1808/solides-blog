package br.com.solides.blogapi.repository;

import br.com.solides.blogapi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
