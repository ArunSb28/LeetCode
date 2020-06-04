package com.leetCodeProblems;

public class HouseThief {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));
	}
	
	
	public static int rob(int[] nums) {
	if(nums.length==0 || nums==null) {
		return 0;
	}
	
	int[] dp = new int[nums.length+1];
	
	dp[0]=0;
	dp[1] = nums[0];
	for(int i=2;i<dp.length;i++) {
		dp[i] = Math.max(dp[i-1], nums[i-1]+dp[i-2]);
		System.out.println(dp[i]);
		
	}
	
		return dp[nums.length];
	}
	
	
	

}
