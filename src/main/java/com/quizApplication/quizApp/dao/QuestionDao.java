package com.quizApplication.quizApp.dao;

import com.quizApplication.quizApp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Questions, Integer> { //it tells <type of table you are working with, and type of primary key>
    List<Questions> findByLanguage(String category);

    @Query(value="SELECT * FROM questions q Where q.language=:language ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Questions> findRandomQuestionsByLanguage(String language, int numQ);


}
