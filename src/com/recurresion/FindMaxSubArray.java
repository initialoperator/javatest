package com.recurresion;

public class FindMaxSubArray {

	public static void main(String[] args){
		int[] array = new int[]{-2, -5, 6, -2, -3, 1, 5, -6};
		
		int sum = findMaxSubarraySum(array);
		System.out.println(sum);
	}
	
	private static int findMaxSubarraySum(int[] arr){
		int l = 0;
		int h = arr.length - 1;
		return findMaxSubarraySum(arr, l, h);
	}
	
	private static int findMaxSubarraySum(int[] arr, int l, int h){
		if(arr == null | arr.length == 0)
			return 0;
		if(l == h)
			return arr[l];
		if(h - l == 1){
			return Math.max(arr[l],arr[h]);
		}
		int mid = (l + h)/2;
		int left = findMaxSubarraySum(arr, l, mid);
		int right = findMaxSubarraySum(arr, mid+1, h);
		int cross = findMaxCrossMidpoint(arr, l, mid, h);
		return Math.max(Math.max(left, right), cross);
	}
	private static int findMaxCrossMidpoint(int[] arr, int l, int m, int h){
		int left = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = m; i <= l; i--){
			sum += arr[i];
			if(sum > left)
				left = sum;
		}
		
		int right = Integer.MIN_VALUE;
		sum = 0;
		for(int i = m+1; i <= h; i++){
			sum += arr[i];
			if(sum > right)
				right = sum;
		}
		return left+right;
	}
}
