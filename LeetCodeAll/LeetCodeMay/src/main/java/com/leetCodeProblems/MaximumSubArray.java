package com.leetCodeProblems;

public class MaximumSubArray {
	
	public static void main(String[] args) {
		
		int arr[] = {-2, -3, -4, -1, -2, -1, -5, -3};
		System.out.println(maxSubArray(arr));
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

}
