package br.com.solides.blogapi.service;

import br.com.solides.blogapi.model.Post;
import br.com.solides.blogapi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post createPost(Post post) {
        // Lógica para criar um novo post
        return postRepository.save(post);
    }

    public Optional<Post> getPost(Long postId) {
        // Lógica para obter um post por ID
        return postRepository.findById(postId);
    }

    public void deletePost(Long postId) {
        // Lógica para excluir um post (verificar se o usuário é o criador, etc.)
        postRepository.deleteById(postId);
    }

    public List<Post> getAllPosts() {
        // Lógica para obter todos os posts
        return postRepository.findAll();
    }
}