package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorTestRun {

	public static void main(String[] args){
		ExecutorTestRun test = new ExecutorTestRun();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		IntStream.range(0, 10000).forEach(i->executor.submit(test::increment));
//		stop(executor);

		for(int i = 0; i < 100; i++){
			System.out.println(test.count);
		}
			
	}
	
	public volatile int count = 0;
	
	public void increment(){
		count++;
	}
}
