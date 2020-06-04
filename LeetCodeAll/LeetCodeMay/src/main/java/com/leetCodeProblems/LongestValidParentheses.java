package com.leetCodeProblems;

import java.util.*;
public class LongestValidParentheses {

	public static void main(String[] args) {

		String s = "((((((()))))))()";
		System.out.println( longestValidParane(s));
	}
	
	public static int longestValidParane(String s) {
		
		if(s.length()<2) {
			return 0;
		}
		int max = 0;
		int diff =0;
		Stack<String> sta = new Stack<String>();
		
		for(int i=0;i<s.length();i++) {
			String s1 = s.substring(i, i+1);
			if(s1.equalsIgnoreCase("(")) {
				sta.add(")");
			}
			else if(!sta.isEmpty() && s1.equalsIgnoreCase(")")&&sta.peek().equalsIgnoreCase(")")) {
				sta.pop();
				diff = diff+2;
				if(max<diff) {
					max =diff;
				}
			}
			else{
				sta.clear();
				diff =0;
			}
			
		}	
		
		return max;
	}

}
