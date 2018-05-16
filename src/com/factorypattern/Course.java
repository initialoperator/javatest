package com.factorypattern;


import java.time.LocalDateTime;

public class Course extends Product {
	protected void method1(){
		System.out.println("private method 1");
	}
	protected static int count = 0;
	static int getCount(){
		return count;
	}
	static{
		System.out.println("staticblock course");
	}
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	public Course(){
		System.out.println("class Course");
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	
public void method2(){
	System.out.println("public method 2");
	}
	
	 class CourseB{
		CourseB(){
			System.out.println("class CourseB");
		}
	}
}
