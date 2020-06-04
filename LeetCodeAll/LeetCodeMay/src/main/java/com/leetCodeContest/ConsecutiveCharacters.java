package com.leetCodeContest;

public class ConsecutiveCharacters {
	
	public static void main(String[]  args) {
		
		
		System.out.println(maxPower("tourist"));
	}
	
	public static int maxPower(String s) {
		
		if(s.length()==0) {
			return 0;
		}
		
		int count =1;
		int max =1;
		
		for(int i=0;i<s.length()-1;i++) {
		
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
				if(max<count) max = count;
			}
			else {
				count =1;
			}
			
		}
		
		
		return max;
	}

}
