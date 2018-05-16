package com.stream;

import java.util.Arrays;
import java.util.List;

public class TestRun {

	public static void main(String[] args){
		List<String> values = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8",
		        "9", "10", "11", "12", "13");
		
		values.stream()
				.map(v -> v+ "111")
				.filter(v-> v.length() > 4)
				.forEach(System.out::println);
	}
}
