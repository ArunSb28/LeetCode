package com.leetCodeProblems;

public class MinCostClimbingStairs {
	
	public static void main(String[] args) {
		
		int[] cost = {0,1,1,0};
		System.out.println(minCost(cost));
	}
	
	public static int minCost(int[] cost) {
		
		if(cost.length==2) {
			return Math.min(cost[0], cost[1]);
		}
		
		int[] dp = new int[cost.length];
		dp[0]=0;
		dp[1] = cost[0];
		for(int i=2;i<cost.length;i++) {
			dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i-1]; 
		}
		
		
		return Math.min(dp[cost.length-2], dp[cost.length-1]);
	}

}
