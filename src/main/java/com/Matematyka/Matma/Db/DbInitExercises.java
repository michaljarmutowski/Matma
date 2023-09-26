package com.Matematyka.Matma.Db;

import com.Matematyka.Matma.repository.ExercisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DbInitExercises implements CommandLineRunner {

    private final ExercisesRepository exercisesRepository;

    @Autowired
    public DbInitExercises(ExercisesRepository exercisesRepository) {
        this.exercisesRepository = exercisesRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        exercisesRepository.saveAll(List.of(

        ));
    }
}
