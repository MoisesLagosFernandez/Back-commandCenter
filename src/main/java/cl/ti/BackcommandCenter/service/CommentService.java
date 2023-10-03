package cl.ti.BackcommandCenter.service;

import cl.ti.BackcommandCenter.model.Comment;

import java.util.List;

public interface CommentService {
    Comment saveComment(Comment comment);
    Comment getCommentById(Long id);
    List<Comment> getAllComments();
    void deleteComment(Long id);
}
