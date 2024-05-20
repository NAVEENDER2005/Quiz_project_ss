package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.QuizQuestion;

import com.quiz.model.quiz_model;
import com.quiz.service.quiz_service;

@RestController
@RequestMapping("quiz")
public class quiz_controller {
	@Autowired
	private quiz_service service;
	
	@GetMapping("questions")
	public ResponseEntity< List<quiz_model>> getAllquestions(){
		return service.getAllQuestions();
	}
	@GetMapping("question/{difficulty}")
	public ResponseEntity< List<quiz_model>> getBydiffi(@PathVariable String difficulty){
		return service.getBydiff(difficulty);}
	
	
	@PostMapping("add")
	public ResponseEntity<String> addQuestion(@RequestBody quiz_model question) {
		return service.addQuestions(question);}
	
	@PostMapping("submit")
	public int right_answer(@RequestBody List<QuizQuestion> answer  )
	{ 
		return service.right_answer(answer);
	}
		
	


		
	}


