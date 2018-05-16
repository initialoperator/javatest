package com.factorypattern;

import java.time.LocalDateTime;

public class Exam extends Product {

	private LocalDateTime examDate;
	private Integer attempt;
	
	public LocalDateTime getExamDate() {
		return examDate;
	}
	public void setExamDate(LocalDateTime examDate) {
		this.examDate = examDate;
	}
	public Integer getAttempt() {
		return attempt;
	}
	public void setAttempt(Integer attempt) {
		this.attempt = attempt;
	}
	
}
