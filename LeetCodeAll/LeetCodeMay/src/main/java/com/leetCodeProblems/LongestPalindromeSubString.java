package com.leetCodeProblems;

public class LongestPalindromeSubString {

	public static void main(String[] args) {
		
		
		String s = "abccba";
		System.out.println(solve(s));
	}
	
	public static String solve(String s) {
		
		if(s.length()<1) {
			return "";
		}
		int start =0;
		int end = 0;
		for(int i=0;i<s.length();i++) {
			int len1 = expandFromMid(s, i, i);
			int len2 = expandFromMid(s, i, i+1);
			int len3 = Math.max(len1, len2);
			System.out.println(len3);
			if(len3>(end-start)) {
				start = i -((len3-1)/2);
				end = i+(len3/2);
			}
			
		}
		
		return (s.substring(start, end+1));
	}
	
	
	public static int expandFromMid(String s, int left, int right) {
		if(s==null || left>right) {
			return 0;
		}
		
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right) ) {
			left--;
			right++;
		}
	
	return (right-left-1);
	}
	
	
}
