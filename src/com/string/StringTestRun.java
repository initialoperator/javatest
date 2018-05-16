package com.string;

import java.util.HashSet;
import java.util.Set;

public class StringTestRun {

	public static void main(String[] args){
		String s = "abcdCab";
		boolean b1 = containPalindrome(s);
		boolean b2 = isPalindrome2(s);
		System.out.println("b1: "+ b1);
		System.out.println("b2: "+ b2);
		
		
	}
	
	private static boolean isPalindrome(String s){
		String sReverse = new StringBuilder(s).reverse().toString();
		if(s.equalsIgnoreCase(sReverse))
			return true;
		else
			return false;
	}
	
	private static boolean isPalindrome2(String s){
		String sLower = s.toLowerCase();
		for(int i = 1; i < sLower.length(); i++){
			if(sLower.charAt(i) != sLower.charAt(sLower.length()-1-i))
				return false;			
		}		
		return true;
	}
	
	private static boolean containPalindrome(String s){
		//first determine if the length is 0
		if(s==null || s.length() == 0)
			return false;
		
		//if s has length, compute pairs of characters from s
		String sLower = s.toLowerCase();
		Set<Character> set = new HashSet<Character>();
		for(int i = 0; i < sLower.length(); i++){
			Character c = sLower.charAt(i);
			if(set.contains(c))
				set.remove(c);
			else
				set.add(c);
		}
		
		//then determine if the length is even or odd
		if(sLower.length()%2 == 0 && set.size() == 0)
			//if even, set should be empty because all exact pairs offset each other
			return true;
		else if(sLower.length()%2 != 0 && set.size() == 1)
			return true;
		else
			return false;
	}
}

