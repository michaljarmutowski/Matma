package com.Matematyka.Matma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity

public class Exercises {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nick;
    private String bookName;
    private String chapter;
    private String exerciseNumber;
    private String contentImgUrl;
    private String solutionImgUrl;

    public Exercises(String nick, String bookName, String chapter, String exerciseNumber, String contentImgUrl, String solutionImgUrl) {
        this.nick = nick;
        this.bookName = bookName;
        this.chapter = chapter;
        this.exerciseNumber = exerciseNumber;
        this.contentImgUrl = contentImgUrl;
        this.solutionImgUrl = solutionImgUrl;
    }
}
