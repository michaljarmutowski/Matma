package com.Matematyka.Matma.Contoller;

import com.Matematyka.Matma.repository.CommentRepository;
import com.Matematyka.Matma.repository.ExercisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final ExercisesRepository exercisesRepository;
    private final CommentRepository commentRepository;

    @Autowired
    public HomeController(ExercisesRepository exercisesRepository, CommentRepository commentRepository) {
        this.exercisesRepository = exercisesRepository;
        this.commentRepository = commentRepository;
    }


    @GetMapping("/home")
    public String home(Model model){

        model.addAttribute("exercises",exercisesRepository.findAll());
        model.addAttribute("comment", commentRepository.findAll());
        return "home";
    }


}
