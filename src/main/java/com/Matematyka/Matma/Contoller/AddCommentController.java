package com.Matematyka.Matma.Contoller;

import com.Matematyka.Matma.model.Comment;
import com.Matematyka.Matma.repository.CommentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addcomment")
public class AddCommentController {

    private final CommentRepository commentRepository;

    public AddCommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    @GetMapping
    public String addCommentPage(){
        return "addcomment";
    }

    @PostMapping
    public String addComment(Comment comment){
        commentRepository.save(comment);
        return "redirect:/home";
    }
}
