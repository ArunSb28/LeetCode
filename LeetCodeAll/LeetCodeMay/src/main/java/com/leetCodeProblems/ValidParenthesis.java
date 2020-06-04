package com.leetCodeProblems;

import java.util.*;
public class ValidParenthesis {
	
	
	public static void main(String[] args) {
		String s = "(])";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		
		Stack<String> sta = new Stack<String>();
		int i =0;
		while(i<s.length()) {
			String s1 = s.substring(i, i+1);
			if(s1.equalsIgnoreCase("(")|| s1.equalsIgnoreCase("[") || s1.equalsIgnoreCase("{")) {
				sta.push(s1);
			}
			if(sta.empty()) {
				return false;
			}
			if(s1.equalsIgnoreCase("}")) {
	
				if(sta.peek().equalsIgnoreCase("{")) sta.pop();
				else {
					return false;
				}
			}
			else	if(s1.equalsIgnoreCase(")")) {
				
				if(sta.peek().equalsIgnoreCase("(")) sta.pop();
				else {
					return false;
				}
			}
			else	if(s1.equalsIgnoreCase("]")) {
				if(sta.peek().equalsIgnoreCase("[")) sta.pop();
				else {
					return false;
				}
			}
			i++;
		}

		if(sta.empty()) {
			return true;
		}
		return false;
	}
	

}
