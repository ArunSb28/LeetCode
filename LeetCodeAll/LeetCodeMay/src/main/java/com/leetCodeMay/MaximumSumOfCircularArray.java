package com.leetCodeMay;

public class MaximumSumOfCircularArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-2,-3,-1};
		System.out.println(maxSum(nums));
	}
	public static int maxSubArray(int[] nums) {
		
		int max_so_far = nums[0];
		int max_end = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			max_end = Math.max(nums[i], max_end+nums[i]); 
	         max_so_far = Math.max(max_so_far, max_end); 
			
		}
		
		return max_so_far;
	}
	
	public static int  maxSum(int[] A) {
		
		int n = A.length;
		int max = maxSubArray(A);
		
		int maxCir = 0;
		for(int i=0;i<n;i++) {
			maxCir += A[i];
			A[i] = -A[i];
		}
		
		maxCir = maxCir+maxSubArray(A);
		if(maxCir==0) {
			return max;
		}
		
		return Math.max(max, maxCir);
	}
	
	
}
