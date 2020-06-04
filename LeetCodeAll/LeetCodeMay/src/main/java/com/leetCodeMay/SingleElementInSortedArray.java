package com.leetCodeMay;

public class SingleElementInSortedArray {
	
	public static void main(String[] args) {
		
		 int[] nums = {2}; 
		 System.out.println(singleNonDupVal(nums));
	}
	
	public static int singleNonDupVal(int[] nums) {
		if(nums.length==1) {
			return nums[0];
		}
		
		return solve(nums, 0, nums.length-1);
	}
	
	public static int solve(int[] nums, int start, int end) {
		if(start>end) {
			return -1;
		}
		if(start==end) {
			return nums[start];
		}
		
		int mid = (start+ end)/2;
		if(mid%2==0) {
			if(nums[mid]==nums[mid+1]) {
				return solve(nums,mid+2,end);
			}
			else
			{
				return solve(nums,start,mid);
			}
		}
		else {
			
			if(nums[mid]==nums[mid-1]) {
				return solve(nums,mid+1,end);
			}
			else
			{
				return solve(nums,start,mid-1);
			}
			
		}
		
	}

}
