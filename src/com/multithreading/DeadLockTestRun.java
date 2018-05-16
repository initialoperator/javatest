package com.multithreading;

import java.util.Arrays;
import java.util.List;

public class DeadLockTestRun {

	public static void main(String[]args){
		try{
			ProducerConsumer producerConsumer = new ProducerConsumer();
		    List<String> values = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8",
		        "9", "10", "11", "12", "13");
		    Thread writerThread = new Thread(() -> values.stream()
		        .forEach(producerConsumer::produce));
		    Thread readerThread = new Thread(() -> {
//		    	System.out.println("inside readThread. values.size(): "+values.size());	    	
		      for (int i = 0; i < values.size(); i++) {
//		    	  System.out.println("inside the loop of readThread");	
		        producerConsumer.consume();
		      }
		    });
		    writerThread.start();
		    readerThread.start();
		    writerThread.join();
		    readerThread.join();
		} catch(Exception e){
			
		}
	    
	}


}
