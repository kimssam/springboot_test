package com.study.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.study.mysite.sbb.answer.Answer;
import com.study.mysite.sbb.user.SiteUser;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=100)
	private String subject;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	private LocalDateTime createDate;
	
	@OneToMany(mappedBy="question", cascade=CascadeType.REMOVE)
	private List<Answer> answerList;
	
	@ManyToOne
	private SiteUser author;
	
	private LocalDateTime modifyDate;
	
	@ManyToMany
	Set<SiteUser> voter;
}



