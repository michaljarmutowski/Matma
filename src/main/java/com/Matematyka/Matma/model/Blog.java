package com.Matematyka.Matma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Blog {

    @Id
    @GeneratedValue
    private Long id;
    @NotBlank(message = "Pole 'Post' nie może być puste")
    private String name;
    @NotBlank(message = "Pole 'Post' nie może być puste")
    @Size(min = 1, max = 255, message = "Długość pola 'Post' musi być od 1 do 255 znaków")
    private String post;

    public Blog( String post) {

        this.post = post;
    }
}
