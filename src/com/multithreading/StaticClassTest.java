package com.multithreading;

public class StaticClassTest {

	public static void main(String[] args){
		Bird b = new Bird();
		Bird.Feather f = new Bird.Feather();
		Bird.Claw c = b.new Claw();
	}
}
