package com.leetCodeProblems;

public class RemovingKDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "1234567890";
		int k = 9;
		System.out.println(removeKdigits1(num, k));

	}
	
	public static String removeKDigits(String num, int k) {
	
		if(num.length()<=k) {
			return "0";
		}
		
		char[] ch = num.toCharArray();
		int i =0;
		num = "";
			
		return num;
	}
	
	
    public static String removeKdigits1(String num, int k) {
		if(num.length()<=k) {
			return "0";
		}
		
		StringBuilder sb = new StringBuilder(num);
		
		for(int i=0;i<k;i++) {
			int j =0;
			while(j<sb.length()-1 && sb.charAt(j) <= sb.charAt(j+1)) {
				j++;
			}
			sb.deleteCharAt(j);
		}
	
        if(sb.length()==0) {
			return "0";
		}
		
		while(sb.length()>1 &&sb.charAt(0)=='0') {
			sb.deleteCharAt(0);
		}
		

		return sb.toString();
    }

}
