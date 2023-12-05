package com.sbbproject.sbbproject.answer;

import com.sbbproject.sbbproject.question.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    List<Answer> findAll();
    Page<Answer> findAllByQuestion(Question question, Pageable pageable);
}