package com.Matematyka.Matma.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.UniqueElements;

@NoArgsConstructor
@Getter
@Setter
@Entity

public class Exercises {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Pole 'Post' nie może być puste")
    private String name;
    @NotBlank(message = "Pole Tytuł Książki nie może być puste")
    private String bookName;

    @NotBlank(message = "Pole Wybierz Rozdział nie może być puste")
    private String chapter;

    @NotBlank(message = "Pole Numer Zadania nie może być puste")
    private Integer exerciseNumber;

    @URL(message = "URL obrazu z treścią jest nieprawidłowy")
    private String contentImgUrl;

    @URL(message = "URL obrazu z rozwiązaniem jest nieprawidłowy")
    private String solutionImgUrl;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Exercises(String bookName, String chapter, Integer exerciseNumber, String contentImgUrl, String solutionImgUrl) {

        this.bookName = bookName;
        this.chapter = chapter;
        this.exerciseNumber = exerciseNumber;
        this.contentImgUrl = contentImgUrl;
        this.solutionImgUrl = solutionImgUrl;
    }
}
