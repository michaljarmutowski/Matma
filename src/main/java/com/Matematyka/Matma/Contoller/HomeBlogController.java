package com.Matematyka.Matma.Contoller;

import com.Matematyka.Matma.repository.BlogRepository;
import com.Matematyka.Matma.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeBlogController {


    private final BlogRepository blogRepository;
    private final UserRepository userRepository;

    public HomeBlogController(BlogRepository blogRepository, UserRepository userRepository) {
        this.blogRepository = blogRepository;
        this.userRepository = userRepository;
    }


    @GetMapping("/blog")
    public String homeblog(Model model) {
        model.addAttribute("user", userRepository.findAll());
        model.addAttribute("blogs", blogRepository.findAll());
        return "homeblog";
    }

}
