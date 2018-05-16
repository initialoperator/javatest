package com.interviewtest;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrayTestRun {
	   public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        String sizeString=sc.nextLine();
	        int size = new Integer(sizeString);
	        String arrayString = sc.nextLine();
	        String[] arrayStringInArray = arrayString.split(" ");//may need to use regex for space
	        System.out.println("arrayStringInArray size: "+ arrayStringInArray.length);
	        int[] array = new int[arrayStringInArray.length];
	        try{
	            for(int i = 0; i< arrayStringInArray.length; i++){
	                String numberString = arrayStringInArray[i];
	                int number = new Integer(numberString);
	                array[i] = number;
	                
	            }
	        }catch(Exception e){
	            System.out.println("Exception happened");
	            throw e;
	        }
	        int maxSum = findLargerSubArray(array);
	        System.out.println(maxSum);
	        
	    }
	    
	    public static int findLargerSubArray(int[] array){
	        if(array == null || array.length == 0){
	            return 0;
	        }else{
	            int index = findFirstIndexOfZero(array);
	            System.out.println("index: "+ index);
	            if(index < 0)
	                return sumOf(array);
	            else{
	                int[] arrayLeft = Arrays.copyOfRange(array, 0, index);
	                int[] arrayRight = Arrays.copyOfRange(array, index+1, array.length);
	                
	                int sumLeft = sumOf(arrayLeft);
	                int maxSumRight = findLargerSubArray(arrayRight);
	                if(sumLeft > maxSumRight)
	                    return sumLeft;                
	                else
	                    return maxSumRight;
	            }
	        }
	    }
	    
	    private static int findFirstIndexOfZero(int[] array){
	        if(array == null | array.length == 0){
	            return -1;
	        }else{
	            for(int i = 0; i < array.length; i++){
	                if(array[i] == 0)
	                    return i;
	            }
	        }
	        return -1;
	    }
	    
	    private static int sumOf(int[] array){
	        int sum = 0;
	        for(int i: array){
	            sum += i;
	        }
	        return sum;
	    }
}
