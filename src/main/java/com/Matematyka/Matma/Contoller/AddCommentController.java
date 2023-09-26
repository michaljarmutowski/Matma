package com.Matematyka.Matma.Contoller;

import com.Matematyka.Matma.model.Comment;
import com.Matematyka.Matma.repository.CommentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/addcomment")
public class AddCommentController {

    private final CommentRepository commentRepository;

    public AddCommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    @GetMapping
    public String addCommentPage(Model model)
    {
        model.addAttribute("comment", new Comment());
        return "addcomment";
    }

    @PostMapping
    public String addComment(@Valid Comment comment, BindingResult result){
        if (result.hasErrors()) {
            return "addcomment";
        }

        commentRepository.save(comment);
        return "redirect:/home";
    }
}
