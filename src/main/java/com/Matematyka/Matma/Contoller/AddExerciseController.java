package com.Matematyka.Matma.Contoller;

import com.Matematyka.Matma.model.Exercises;
import com.Matematyka.Matma.repository.ExercisesRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addexercise")
public class AddExerciseController {

    private final ExercisesRepository exercisesRepository;

    @Autowired
    public AddExerciseController(ExercisesRepository exercisesRepository) {
        this.exercisesRepository = exercisesRepository;
    }

    @GetMapping
    public String addExercisePage(Model model){
        model.addAttribute("exercise", new Exercises());
        return "addexercise";
    }

    @PostMapping
    public String addExercise(@Valid Exercises exercises, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "addexercise";
        }
        exercisesRepository.save(exercises);
        return "redirect:/home";
    }


}
