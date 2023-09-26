package com.Matematyka.Matma.Contoller;


import com.Matematyka.Matma.model.User;
import com.Matematyka.Matma.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/submit")
public class SubmitController {

    private final UserRepository userRepository;

    public SubmitController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String submitPage(Model model){
        model.addAttribute("user", new User());
        return "submit";
    }

    @PostMapping
    public String addSubmit(User user){
        userRepository.save(user);
        return "redirect:/home";
    }
}
