package com.leetCodeProblems;

public class FindMinumuminRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = {3,4,5,1,2};
	System.out.println(solve(nums));	
	}
	
	public static int solve(int[] nums) {
		if(nums.length==0) {
			return 0;
		}
		if(nums.length==1) {
			return nums[0];
		}
		int start =0;
		int len = nums.length-1;
		
		
		if(nums[len]>nums[0]) {
			return nums[0];
		}
		
		while(len>=start) {
			int mid = start + (len-start)/2;
			
			if(nums[mid]>nums[mid+1]) {
				return nums[mid+1];
			}
			
			 if (nums[mid - 1] > nums[mid]) {
			        return nums[mid];
			      }
			 
			 if (nums[mid] > nums[0]) {
			        start = mid + 1;
			      } else {
			    	  len = mid - 1;
			      }
		}
		
		return -1;
	}
	
	
}
