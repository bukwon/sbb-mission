package com.sbbproject.sbbproject;

import com.sbbproject.sbbproject.answer.Answer;
import com.sbbproject.sbbproject.answer.AnswerService;
import com.sbbproject.sbbproject.question.Question;
import com.sbbproject.sbbproject.question.QuestionRepository;
import com.sbbproject.sbbproject.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용 무";
            this.questionService.create(subject, content);
        }
    }
}