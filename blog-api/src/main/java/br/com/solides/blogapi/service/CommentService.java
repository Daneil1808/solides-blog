package br.com.solides.blogapi.service;

import br.com.solides.blogapi.model.Comment;
import br.com.solides.blogapi.model.Post;
import br.com.solides.blogapi.repository.CommentRepository;
import br.com.solides.blogapi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    private PostRepository postRepository;

    public Comment addComment(Long postId, Comment comment) {
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new RuntimeException("Post not found with id: " + postId));

        Comment newComment = new Comment();
        comment.setPost(post);
        comment.setText(comment.getText());

        Comment savedComment = commentRepository.save(newComment);

        post.getComments().add(savedComment);
        postRepository.save(post);

        return savedComment;
    }

    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }
}