package com.leetCodeProblems;

import java.util.*;

public class LongestSubString {

	
	public static void main(String[] args) {
		
		String s = "pwwkew";
		//System.out.println(lenghtOfLongestSubString(s));
		System.out.println(lengthOFString(s));
	}
	
	public static int lenghtOfLongestSubString(String s) {
		String s2 = s;
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		int count =0;
		int max= 0;
		int i =0;
		int j =0;
		String s1 = "";
		if(s.length()>0) {
			s1 = s.substring(0, 1);
			s = s.replaceAll(s1, " ").trim();
		}
		else {
			return 0;
		}
		if(s.isEmpty()) {
			return 1;
		}
		else {
			while(i<s2.length()) {
			String data = s2.substring(i,i+1);
				if(hm.get(data) == null) {
					hm.put(data, 1);
					count++;
					if(max<count) max = count;
					i++;
				}
				else {
					hm.clear();
					count =0;
					j++;
					i =j;
				}
				
			}			
		}
		
		return max;
	}
	
	public static int lengthOFString(String s) {
		
        int n = s.length();
        Set<Character> set = new HashSet<Character>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
            	set.add(s.charAt(j++));
            	System.out.println(set);
                ans = Math.max(ans, j - i);
            }
            else {
            	System.out.println("Hello");
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
	

	
}
