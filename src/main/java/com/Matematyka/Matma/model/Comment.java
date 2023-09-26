package com.Matematyka.Matma.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Comment {

        @Id
        @GeneratedValue
        private Long id;

        @NotBlank(message = "Pole 'Post' nie może być puste")
        private String name;

        @NotBlank(message = "Pole nie może być puste")
        @Size(min = 1, max = 255, message = "Komentarz musi mieć od 1 do 255 znaków")
        private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Comment(String content) {

        this.content = content;
    }
}
