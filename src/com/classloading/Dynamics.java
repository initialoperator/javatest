package com.classloading;

public class Dynamics {

	static{
		System.out.println("inside the static block");
	}
	public Dynamics(){
		System.out.println("inside the Constructor");
	}
}
