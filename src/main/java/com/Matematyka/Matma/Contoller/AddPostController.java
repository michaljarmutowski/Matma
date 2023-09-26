package com.Matematyka.Matma.Contoller;

import com.Matematyka.Matma.model.Blog;
import com.Matematyka.Matma.repository.BlogRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String addPostPage(Model model){
        model.addAttribute("blog", new Blog());
        return "addpost";
    }

    @PostMapping
    public String addPost(@Valid Blog blogs, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "addpost";
        }
        blogRepository.save(blogs);
        return "redirect:/blog";
    }
}
