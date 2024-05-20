	package com.quiz.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quiz.model.quiz_model;
@Repository
public interface quiz_repo extends JpaRepository<quiz_model, Long> {

	List<quiz_model> findByDifficulty(String difficulty);
	
	
}
