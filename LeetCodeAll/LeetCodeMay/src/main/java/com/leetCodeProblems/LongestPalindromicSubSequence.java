package com.leetCodeProblems;

public class LongestPalindromicSubSequence {
	
	
	public static void main(String[] args) {
		
		String s ="GEEKSFORGEEKS";
		char[] seq = s.toCharArray();
		int n = seq.length;
		System.out.println(LPS(seq,0,n-1));
	}
	
	public static int LPS(char[] seq, int i,int j) {
		
		if(i==j) {
			return 1;
		}
		if(seq[i]==seq[j]&&i+1==j) {
			return 2;
		}
		if(seq[i]==seq[j]) {
			return(LPS(seq,i+1,j-1)+2);
		}
		
		return(Math.max(LPS(seq,i+1,j),LPS(seq,i,j-1)));
	}
	
	public static int LPSDP(String s) {
		int i,j,cl;
		int n = s.length();
		
		int[][] dp = new int[n][n];
		
		for(i=0;i<n;i++) {
			dp[i][i] = 1;
			
		}
			for(cl=2;cl<=n;cl++) {
				
				for(i=0;i<n-cl+1;i++) {
					
					j = i + cl -1;
					
					if(s.charAt(i)==s.charAt(j)&&cl==2) {
						dp[i][j]=2;
					}
					else if (s.charAt(i)==s.charAt(j)) {
						dp[i][j]= dp[i+1][j-1] +2;
					}
					else
						dp[i][j]= Math.max(dp[i+1][j], dp[i][j-1]);
				}
				
			}
		return dp[0][n-1];
	}

}
