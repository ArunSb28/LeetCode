package com.leetCodeMay;

public class ValidPerfectSquare {

	
	public static void main(String[] args) {
		int num = 2147483647;
		
		System.out.println(isPerfectSquare(num));
		
	}
	
	
	public static boolean isPerfectSquare(int num) {
		int mod = num%10;
		if(mod==2|| mod ==3 || mod ==7 || mod ==8) {
			return false;
		}
		long l = 1;
		long n = num;
		while(l<=n) {
				long mid = l-(l-n)/2;
				
				if(mid*mid==num) {
					return true;
				}
				else if(mid*mid<num) {
					l = mid+1;
				}
				else
				{
					n =mid-l;
				}
			}
	
		return false;
	}
	
	public static int isSquare(int start, int end, int num) {
		 
		
		
		return -1;
	}
}
