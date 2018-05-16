package com.multithreading;

public class ProducerConsumer {
		  private  String value = "";
		  private  boolean hasValue = false;
		  public void produce(String value) {
		    while (hasValue) {
		      try {
//		    	  System.out.println("Produce starts");
		        Thread.sleep(5);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		    }
		    System.out.println("Producing " + value + " as the next consumable");
//		    System.out.println("In produce, hasValue is " + hasValue +" and is turning into true");
		    this.value = value;
		    hasValue = true;
		  }
		  public String consume() {
		    while (!hasValue) {
		      try {
		    	  System.out.println("Consume starts");
		        Thread.sleep(5);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		    }
		    String value = this.value;
//		    System.out.println("In consume, hasValue is " + hasValue +" and is turning into false");
		    hasValue = false;
		    System.out.println("Consumed " + value);
		    return value;
		  }
		
}
