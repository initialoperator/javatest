package com.factorypattern;

public class TestRunExtend extends TestRun {

	public static void main(String[] args){
		Course c1 = new Course();
		Course c2 = new Course();
		int count = 127;
		switch(count){
			default: System.out.println("default");
			case 127:  System.out.println("127");
			case 128:  System.out.println("128");
		}
	}
	
	public static void printit(){
		System.out.println("TestRun Print it");
	}
}
