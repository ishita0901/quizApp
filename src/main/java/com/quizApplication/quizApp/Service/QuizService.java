package com.quizApplication.quizApp.Service;

import com.quizApplication.quizApp.dao.QuestionDao;
import com.quizApplication.quizApp.dao.QuizDao;
import com.quizApplication.quizApp.model.Questions;
import com.quizApplication.quizApp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String language, int numQ, String title) {

        List<Questions> question = questionDao.findRandomQuestionsByLanguage(language, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(question);
        quizDao.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
