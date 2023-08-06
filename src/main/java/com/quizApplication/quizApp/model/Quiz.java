package com.quizApplication.quizApp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @ManyToMany
    private List<Questions> question;

    public void setTitle(String title) {
    }

    public void setQuestions(List<Questions> question) {
    }
}
