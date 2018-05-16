package com.interviewtest;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintIntegerTestRun {//for tip 40
//solution for unsigned integer
	public static void main(String[] args){
		Integer[] array1 = new Integer[]{15,89,35,79, 46, 73,3,22,82,38};
		Integer[] array2 = new Integer[] {66,69,79,21,43,47,25,43,37,16,12,53,65,47,57};
		int max = findMaxFromTwoArrays(array1, array2);
		
		Integer[] summary = new Integer[max+1];
		int duplication = 0;
		for(Integer i : array1){
			if(summary[i] == null){
				summary[i] = i;
			}else{
				duplication++;
			}
		}
		for(Integer i : array2){
			if(summary[i] == null){
				summary[i] = i;
			}else{
				duplication++;
			}
		}
		
		String printIntegers = "";
		for(Integer i: summary){
			if(i!=null){
				printIntegers += i +",";
			}
		}
		System.out.println("Total integers: "+printIntegers);
		System.out.println("Duplications: "+duplication);
		
		Integer[] array3 = Arrays.copyOfRange(array2, 0, 2);
		for(Integer i: array3){
			System.out.println("In array3: "+i);
		}
	}
	
	private static int findMaxFromTwoArrays(Integer[] array1, Integer[]array2){
		//precondition: both array has been initialized
		int max1 = Arrays.asList(array1).stream().max(Integer::compare).get();
		int max2 = Arrays.asList(array2).stream().max(Integer::compare).get();
		return max1 > max2? max1: max2;
	}
}
