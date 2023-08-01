package com.quizApplication.quizApp.controller;
import com.quizApplication.quizApp.Questions;
import com.quizApplication.quizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

//java class for accepting the request
@RestController
@RequestMapping("questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("language/{language}")//the category in {} is the path variable
    public ResponseEntity<List<Questions>> getQuestionsByLanguage(@PathVariable String language){
        return questionService.getQuestionsByLanguage(language);
    }

    @PostMapping("add") //send data to the server
    public ResponseEntity<String> addQuestion(@RequestBody Questions questions)
   {
       return questionService.addQuestion(questions);
    }
}
