package com.leetCodeProblems;

public class ClimbingStairs {
	
	public static void main(String[] args) {
		int m =4;
		System.out.println(climbStairs(m));
	}
	
	public static int climbStairs(int m) {
		int arr[] = new int[m];
		arr[0]=1;
		arr[1] = 2;
		
		for(int i=2;i<arr.length;i++) {
			arr[i]= arr[i-2]+arr[i-1];
		}
		
		return arr[m-1];
		
	}

}
