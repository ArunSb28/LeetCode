package com.leetCodeMay;

import java.util.*;

public class FindAllAnagrams {

	public static void main(String[] args) {
		
		String s = "abab";
		String p = "ab";
		System.out.println(findAnagrams(s, p));
		
	}
	
	public static List<Integer> findAnagrams(String s, String p) {
   	
		List<Integer> li = new ArrayList<Integer>();
		
			if(s==null||s.length()<p.length()) {
			return li;
			}
			int[] pArr = new int[26];
			int[] sArr = new int[26];
			
			int pLen = p.length();
			int sLen = s.length();
			
			for(int i=0;i<pLen;i++) {
				pArr[p.charAt(i)-'a'] = pArr[p.charAt(i)-'a'] +1 ;
				sArr[s.charAt(i)-'a'] = sArr[s.charAt(i)-'a'] +1 ;
			}
			
			for(int i=pLen;i<sLen;i++) {
				
				if(compare(pArr, sArr)) {
					li.add(i-pLen);
				}
				sArr[s.charAt(i)-'a']+=1;
				sArr[s.charAt(i-pLen)-'a']-=1;
				
			}
			if(compare(pArr, sArr)) {
				li.add(sLen-pLen);
			}
			
			return li;
	}
	
	
	public static boolean compare(int[] pArr, int[] sArr) {
		
		for(int i=0;i<26;i++) {
			if(pArr[i]!=sArr[i])
				return false;
		}
		
		return true;
	}
}
