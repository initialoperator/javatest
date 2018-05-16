package com.functionalInterface;

public class TestRun {

	public static void main(String[] args){
		
		//When an instance of TalkInterface is created, its run() method must be implemented.
		//An instance of TalkInterface, talk1, has its run() method implemented (in a traditional way)
		TalkInterface talk1 = new TalkInterface(){
			@Override
			public void run() {
				System.out.println("This is from talk1 with Thread: "+ Thread.currentThread().getName());
			}			
		};
//		An instance of TalkInterface, talk2, has its run() method implemented with lambda expression
		TalkInterface talk2 = () ->{
			System.out.println("This is from talk2 with Thread: "+ Thread.currentThread().getName());
		};
		
		talk1.run();
		talk2.run();
		
		//Runnable is one of the Java built-in functional interface
		//task1, an instance of Runnable has its run() method implemented in a traditional way
		Runnable task1 = new Runnable(){
			@Override
			public void run() {
				talk1.run();
			}
		};
		
//		task2, an instance of Runnable has its run() method implemented with lambda expression
		Runnable task2 = () ->{
			talk2.run();
		};
		
//		created 2 extra threads to run taks1 and task2
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
				
	}
	
}
