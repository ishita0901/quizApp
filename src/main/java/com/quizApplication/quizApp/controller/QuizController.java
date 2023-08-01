package com.quizApplication.quizApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String language, @RequestParam int numQ, @RequestParam String title){ //to accept the URL variables use requestParam
            return new ResponseEntity<>("Yay, I'm here", HttpStatus.OK);
    }
//ishi
}
