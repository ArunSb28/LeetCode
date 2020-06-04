package com.leetCodeProblems;

import java.util.*;
public class Triangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,3,2,5,9};
	}
	
	 public int minimumTotal(List<List<Integer>> triangle) {
	        
		 int len = triangle.size()-1;
		 int[] dp = new int[triangle.size()];
		 for(int i=0;i< triangle.get(len).size();i++) {
			 dp[i]= triangle.get(len).get(i);
		 }
		 for(int i=triangle.size()-2;i>=0;i--) {
			 for(int j=0;j<triangle.get(i).size();j++) {
				 dp[j]=triangle.get(i).get(j)+(int)Math.min(dp[j], dp[j+1]);
			 }
		 }

		 return dp[0];
	    }

}
