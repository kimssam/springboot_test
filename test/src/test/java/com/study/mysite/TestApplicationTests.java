package com.study.mysite;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.study.mysite.sbb.answer.Answer;
import com.study.mysite.sbb.answer.AnswerRepository;
import com.study.mysite.sbb.question.Question;
import com.study.mysite.sbb.question.QuestionRepository;
import com.study.mysite.sbb.question.QuestionService;

@SpringBootTest
class TestApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private QuestionService questionService;
	
	
	@Test
	void testJpa() {
		/*
		Question q1 = new Question();
		q1.setSubject("스프링 부트의 이름은 무슨 뜻인가요?");
		q1.setContent("스프링 부트 사용법을 알고 싶어요");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);
		
		Question q2 = new Question();
		q2.setSubject("jpa란?");
		q2.setContent("jpa 사용법을 알고 싶어요");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
		
		List<Question> all = this.questionRepository.findAll();
		//assertEquals(5, all.size());
		
		Question q =all.get(0);
		assertEquals("스프링 부트의 이름은 무슨 뜻인가요?", q.getSubject());
		
		
		Optional<Question> q =this.questionRepository.findById(11);
		if(q.isPresent()) {
			Question qs = q.get();
			assertEquals("jpa란??", qs.getSubject());
		}
		
		
		Question q = this.questionRepository.findBySubject("jpa란?");
		assertEquals(11, q.getId());
		
		Question q = this.questionRepository.findBySubjectAndContent("jpa란?", "jpa 사용법을 알고 싶어요");
		assertEquals(11, q.getId());
		
		List<Question> qList = this.questionRepository.findBySubjectLike("%스프링%");
		Question q = qList.get(0);
		assertEquals(1, q.getId());
		
		List<Question> qList = this.questionRepository.findBySubjectLike("%스프링%");
		assertEquals(7, qList.size());
		
		Optional<Question> q =this.questionRepository.findById(1);
		assertTrue(q.isPresent());
		Question qs =q.get();
		qs.setSubject("수정된 제목");
		this.questionRepository.save(qs);
		this.questionRepository.delete(qs);
		assertEquals(10, this.questionRepository.count());
		
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		Answer a = new Answer();
		a.setContent("답변입니다.");
		a.setQuestion(q);
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);
		
		
		Optional<Answer> oa = this.answerRepository.findById(1);
		assertTrue(oa.isPresent());
		Answer a = oa.get();
		assertEquals(2, a.getQuestion().getId());
		
		
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		List<Answer> answerList = q.getAnswerList();
		assertEquals(1, answerList.size());
		assertEquals("답변입니다.", answerList.get(0).getContent());
		
		
		for(int i=1; i<=300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "테스트 상세내용 넣기";
			this.questionService.create(subject, content, null);
			
		}
		*/
	}

}








