package com.Matematyka.Matma.repository;

import com.Matematyka.Matma.model.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercisesRepository extends JpaRepository<Exercises,Long> {
}
