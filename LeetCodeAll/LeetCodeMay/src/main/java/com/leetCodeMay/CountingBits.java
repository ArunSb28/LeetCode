package com.leetCodeMay;

public class CountingBits {

	public static void main(String[] args) {
		
		int[] data = countBits(9);
//		for(int i=0;i<data.length;i++) {
//			System.out.println(data[i]);
//		}
		
	}
	public static int[] countBits(int num) {
    
		int[] dp = new int[num+1];
		dp[0] = 0;
		if(num==0) {
			return dp;
		}
		for(int i=1;i<num+1;i++) {
			dp[i] = dp[i>>1] + i%2;
			System.out.println(dp[i]);
		}
		
		
		
	return dp;
    }
	
	
}
