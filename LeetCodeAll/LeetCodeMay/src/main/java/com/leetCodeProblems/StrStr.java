package com.leetCodeProblems;

public class StrStr {

	
	public static void main(String[] args) {
		
	System.out.println(strStr("hello","hello"));
	}
	
	public static int strStr(String haystack, String needle) {
		if(!haystack.contains(needle)) {
			return -1;
		}
		if((needle.equalsIgnoreCase("") || haystack.equalsIgnoreCase("") )) {
			return 0;
		}
        return haystack.indexOf(needle);
    }
}
