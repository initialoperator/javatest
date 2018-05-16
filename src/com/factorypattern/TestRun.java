package com.factorypattern;

import java.util.Arrays;
import java.util.List;

public class TestRun {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {



	}




	private static long sumOfSub(int[] arr) {
		long sum = 0l;
		for (int i : arr) {
			long val = (long) i;
			sum += val;
		}
		return sum;
	}

}
