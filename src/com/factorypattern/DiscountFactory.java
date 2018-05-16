package com.factorypattern;

import java.time.LocalDateTime;

public class DiscountFactory {

	public static IDiscount getIDiscountFromProduct(Product product){
		if(product instanceof Course){
			Course course = (Course)product;
			if(LocalDateTime.now().isBefore(course.getStartDate().minusDays(60L)) ){
				return new DiscountForCourse();
			}else{
				return new DiscountTwoForCourse();
			}
		}else if(product instanceof Exam){
			Exam exam = (Exam)product;
			if(exam.getAttempt()<2){
				return new DiscountForExam();
			}else{
				return new DiscountTwoForExam();
			}
		}
		return null;
	}
}
