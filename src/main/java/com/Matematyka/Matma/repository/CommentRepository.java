package com.Matematyka.Matma.repository;

import com.Matematyka.Matma.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
