package com.leetCodeProblems;

public class BuyStocks {
	
	public static void main(String[] args) {
		
	}
	
	public static int maxProfit(int[] prices) {
		
		if(prices.length<2) {
			return 0;
		}
		int max =0;
		int start = prices[0];
		for(int i=1;i<prices.length-1;i++) {
			if(start<prices[i]) {
				int diff = prices[i]-start;
				if(max<diff) max = diff;
			}
			else {
				start = prices[i];	
			}
		}
		return max;
	}
	
	
	public static int solve(int[] arr, int l, int r) {
		
		
		
		return -1;
	}

}
