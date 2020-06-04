package com.leetCodeMay;

public class UnCrossedLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] A = {2,5,1,2,5};
			int[] B = {10,5,2,1,5,2};
			System.out.println(maxUnCrossed(A, B));
	}
	
	public static int maxUnCrossed(int[] A, int[] B) {
		if(A.length==0 || B.length==0) {
			return 0;
		}
		
		 int m = A.length, n = B.length, dp[][] = new int[m + 1][n + 1];
	        for (int i = 1; i <= m; ++i) {
	        	String s = "";
	            for (int j = 1; j <= n; ++j) {
	            	if (A[i - 1] == B[j - 1])
	                    dp[i][j] = 1 + dp[i - 1][j - 1];
	                else
	                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
	            
	            	s = s+" "+ Integer.toString(dp[i][j]);
	            }
	            System.out.println(s.trim());
	            System.out.println();
	}
	        
	        return dp[m][n];
		
	}

}
