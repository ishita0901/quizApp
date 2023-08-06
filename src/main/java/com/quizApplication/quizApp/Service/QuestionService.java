package com.quizApplication.quizApp.Service;

import com.quizApplication.quizApp.model.Questions;
import com.quizApplication.quizApp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public ResponseEntity<List<Questions>> getAllQuestions(){
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK); //findAll() gives you the list
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Questions>> getQuestionsByLanguage(String language) {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK); //findAll() gives you the list
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Questions questions) {
        questionDao.save(questions);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}
