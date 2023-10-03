package br.com.solides.blogapi.controller;

import br.com.solides.blogapi.model.Comment;
import br.com.solides.blogapi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/postId")
    public ResponseEntity<Comment> addComment(
            @RequestBody Long postId,
            @RequestBody Comment comment
    ) {
        Comment addedComment = commentService.addComment(postId, comment);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedComment);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long commentId) {
        commentService.deleteComment(commentId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
