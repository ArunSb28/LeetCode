package com.leetCodeProblems;

import java.util.regex.Pattern;

public class StringToInteger {

	public static void main(String[] args) {
		String s = "-91283472332";
		
		System.out.println(myAtoi(s));

	}

	
	public static int myAtoi(String str) {
		
		if(str.length()==0 || str.trim().length()==0) {
			return 0;
		}
		
		str = str.trim();
		String minus = "";
		int j =0;
		int finalVal = 0;
		if(str.substring(0, 1).equalsIgnoreCase("-")) {
			minus = "-";
			j = 1;
			finalVal = Integer.MIN_VALUE;
		}
		if(str.substring(0, 1).equalsIgnoreCase("+")) {
			j =1;
			finalVal = Integer.MAX_VALUE;
		}
		String fin = "";
		for(int i=j;i<str.length();i++) {
			String temp = str.substring(i,i+1);
			if(temp.equalsIgnoreCase("0")||temp.equalsIgnoreCase("1")||temp.equalsIgnoreCase("2")||temp.equalsIgnoreCase("3")||temp.equalsIgnoreCase("4")||temp.equalsIgnoreCase("5")||temp.equalsIgnoreCase("6")||temp.equalsIgnoreCase("7")||temp.equalsIgnoreCase("8")||temp.equalsIgnoreCase("9")) {
				fin = fin+temp;
			}
			else {
				i = str.length();
			}
			
		}
			fin = minus+fin;
			try {
			finalVal = Integer.parseInt(fin);
			}
			catch (Exception e) {
				if(minus.equalsIgnoreCase("-")&&fin.length()>1) {
					finalVal = Integer.MIN_VALUE;
				}
				else if(minus.equalsIgnoreCase("")&&fin.length()>1) {
					finalVal = Integer.MAX_VALUE;
				}
			}

		
		
		return finalVal;
	}
	
}
