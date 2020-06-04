package com.leetCodeProblems;

public class HouseThief2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,3,2,5,9};
		System.out.println(rob(nums));
	}
	
	public static int rob(int[] nums) {
		
		if(nums.length==0 || nums==null) {
			return 0;
		}
		if(nums.length==1) {
			return nums[0];
		}
		
		
		int[] dp = new int[nums.length];
		int[] dp1 = new int[nums.length];
		
		dp[0]=0;
		dp[1] = nums[0];
		dp1[0]=0;
		dp1[1] = nums[1];
		int i =2,j=3;
		while(i<nums.length || j<nums.length) {
			if(i!=nums.length) dp[i] = Math.max(dp[i-1], nums[i-1]+dp[i-2]);
			//System.out.println(dp[i]);
			dp1[j-1] =  Math.max(dp1[j-2], nums[j-1]+dp1[j-3]);
			
//			System.out.println(dp[i]);
//			System.out.println(dp1[j-1]);
			i++;
			j++;
		}
		
		
		return Math.max(dp[nums.length-1], dp1[nums.length-1]);
	}

}
