package com.Matematyka.Matma.Contoller;

import com.Matematyka.Matma.model.Exercises;
import com.Matematyka.Matma.repository.ExercisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public String addExercisePage(){
        return "addexercise";
    }

    @PostMapping
    public String addExercise(Exercises exercises){
        exercisesRepository.save(exercises);
        return "redirect:/home";
    }
}
