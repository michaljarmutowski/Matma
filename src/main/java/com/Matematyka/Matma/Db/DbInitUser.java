package com.Matematyka.Matma.Db;

import com.Matematyka.Matma.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

public class DbInitUser implements CommandLineRunner {

    private final UserRepository userRepository;

    public DbInitUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(List.of(

        ));
    }
}
