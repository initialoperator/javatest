package com.multithreading;

public class Bird {

	public static class Feather{
		public Feather(){
			System.out.println("Feathers are created.");
		}
	}
	
	public class Claw{
		public Claw(){
			System.out.println("Claws are created.");
		}
	}
	public Bird(){
		System.out.println("A bird is born.");
	}
}
