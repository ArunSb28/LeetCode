package com.leetCodeProblems;

import java.util.*;
import java.util.Map.Entry;

public class ZigZag {
	
	
	public static void main(String[] args) {
		
		System.out.println(convert("PAY",4));
	}
	
	public static String convert(String s, int row) {
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		int count = 1;
		boolean inc = true;
		if(s.length()<=row) {
			return s;
		}
		for(int i=0;i<s.length();i++) {
			
			if(hm.get(count)==null) {
				hm.put(count, s.substring(i, i+1));
			}
			else {
				String tmp = hm.get(count).toString() + s.substring(i, i+1);
				hm.put(count, tmp);
			}
			
			if(inc==false) {
				count--;
			}
			if(count==row) {
				inc = false;
				count--;
			}
			if(inc==true) {
				count++;
			}
			if(count<1) {
				inc = true;
				count+=2;
			}
			
		}
		String out = "";
		for(Map.Entry<Integer, String> entry: hm.entrySet()) {
			out = out+entry.getValue();
			
		}
		
		return out;
	}

}
