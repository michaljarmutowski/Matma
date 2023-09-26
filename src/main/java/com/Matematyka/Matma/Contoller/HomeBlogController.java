package com.Matematyka.Matma.Contoller;

import com.Matematyka.Matma.repository.BlogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeBlogController {


    private final BlogRepository blogRepository;

    public HomeBlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    @GetMapping("/blog")
    public String homeblog(Model model) {
        model.addAttribute("blogs", blogRepository.findAll());
        return "homeblog";
    }

}
