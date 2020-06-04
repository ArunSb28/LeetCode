package com.leetCodeMay;

import java.util.HashMap;

public class RansomNote {
	
	public static void main(String[] args) {
		
		
	
	}
	
	public static boolean canConstruct(String r, String m) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		boolean ret = true;
		for(int i=0;i<m.length();i++) {
			
			String s = r.substring(i, i+1);
			if(hm.get(s)==null) {
				hm.put(s,1);
			}
			else {
				int sum = Integer.parseInt(hm.get(s).toString()) +1;
				hm.put(s, sum);
			}
			
		}
		
		for(int j=0;j<r.length();j++) {
			
			String s1 = r.substring(j,j+1);
			if(hm.get(s1)==null || Integer.parseInt(hm.get(s1).toString())<1) {
				ret = false;
				break;
			}
			else {
				int sum = Integer.parseInt(hm.get(s1).toString()) - 1;
				hm.put(s1, sum);
			}
			
			
		}
		
		
		return false;
	}

}
