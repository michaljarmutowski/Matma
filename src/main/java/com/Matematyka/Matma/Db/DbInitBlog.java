package com.Matematyka.Matma.Db;

import com.Matematyka.Matma.repository.BlogRepository;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

public class DbInitBlog implements CommandLineRunner {

    public final BlogRepository blogRepository;


    public DbInitBlog(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        blogRepository.saveAll(List.of(

        ));
    }
}
