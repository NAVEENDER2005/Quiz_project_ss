package com.quiz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quiz.model.QuizQuestion;

import com.quiz.model.quiz_model;
import com.quiz.repo.QuizQuestionRepository;
import com.quiz.repo.quiz_repo;

@Service
public class quiz_service {
		@Autowired
		private quiz_repo repo;
		@Autowired
		private QuizQuestionRepository questionRepository;
	
		public ResponseEntity<List<quiz_model>> getAllQuestions(){
			try {
		return new ResponseEntity<>(repo.findAll(),HttpStatus.OK);}
			catch (Exception e) {
			e.printStackTrace();
			}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);	
			}
		
		public ResponseEntity<List<quiz_model>> getBydiff(String difficulty) {
			try {
				return new ResponseEntity<>(repo.findByDifficulty(difficulty),HttpStatus.OK);}
					catch (Exception e) {
					e.printStackTrace();
					}
				return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);	
					}
	
		public ResponseEntity<String> addQuestions(quiz_model question) {
			 repo.save(question);
			return new ResponseEntity<>("Question added successfully !",HttpStatus.CREATED);	
		}

		public int right_answer(List<QuizQuestion> answer) {
			
          
	        int totalScore=0;
			for (QuizQuestion answers : answer) {
	            Long id = answers.getId();
	            String clientAnswer = answers.getAnswer();

	            Optional<quiz_model> optionalQuestion = repo.findById(id);
	            
	                quiz_model question = optionalQuestion.get();
	                String correctAnswer = question.getCorrectAnswer();

	                if (correctAnswer.equals(clientAnswer)) {
	                    totalScore++;
	                
	            }
	        }

	        return totalScore;
		}
		
		

		 
	   }

	
		
		
	
		
		
	


		
	


