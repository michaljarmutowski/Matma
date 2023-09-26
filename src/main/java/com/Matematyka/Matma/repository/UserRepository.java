package com.Matematyka.Matma.repository;

import com.Matematyka.Matma.model.Exercises;
import com.Matematyka.Matma.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
