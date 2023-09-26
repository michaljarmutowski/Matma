package com.Matematyka.Matma.Contoller;

import com.Matematyka.Matma.model.Blog;
import com.Matematyka.Matma.repository.BlogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addpost")
public class AddPostController {

    private final BlogRepository blogRepository;

    public AddPostController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    @GetMapping()
    public String addPostPage(){

        return "addpost";
    }

    @PostMapping
    public String addPost(Blog blogs){
        blogRepository.save(blogs);
        return "redirect:/blog";
    }
}
