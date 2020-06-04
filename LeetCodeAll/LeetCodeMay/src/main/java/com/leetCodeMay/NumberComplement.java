package com.leetCodeMay;

public class NumberComplement {
	
	public static void main(String[] args) {
		
		System.out.println(findComplement(5));
		
	}
	
	public static int findComplement(int n) {
		
		
		String s = Integer.toBinaryString(n);
		String s1 = "";
		
		for(int i=0;i<s.length();i++) {

			if(s.substring(i,i+1).equalsIgnoreCase("0")) {
				s1 = s1+"1";
			}
			else
			{
				s1 = s1 + "0";
			}
			
		}
			
		
		return Integer.parseInt(s1, 2);
	}

}
