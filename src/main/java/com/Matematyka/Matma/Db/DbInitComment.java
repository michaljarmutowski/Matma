package com.Matematyka.Matma.Db;

import com.Matematyka.Matma.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

public class DbInitComment implements CommandLineRunner {

    private final CommentRepository commentRepository;


    public DbInitComment(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        commentRepository.saveAll(List.of(


        ));
    }
}
