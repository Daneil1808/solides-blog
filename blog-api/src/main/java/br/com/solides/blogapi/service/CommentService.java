package br.com.solides.blogapi.service;

import br.com.solides.blogapi.model.Comment;
import br.com.solides.blogapi.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment addComment(Comment comment) {
        // Lógica para adicionar um comentário a um post
        return commentRepository.save(comment);
    }

    public void deleteComment(Long commentId) {
        // Lógica para excluir um comentário (verificar se o usuário é o criador, etc.)
        commentRepository.deleteById(commentId);
    }
}