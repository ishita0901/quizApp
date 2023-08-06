package com.quizApplication.quizApp.dao;

import com.quizApplication.quizApp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {


}
