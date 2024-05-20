package com.quiz.model;


import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "quiz_questions")
public class QuizQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String answer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public QuizQuestion(Long id, String answer) {
		super();
		this.id = id;
		this.answer = answer;
	}
	public QuizQuestion() {
		super();
	}
	@Override
	public String toString() {
		return "QuizQuestion [id=" + id + ", answer=" + answer + "]";
	}
    
    

    }