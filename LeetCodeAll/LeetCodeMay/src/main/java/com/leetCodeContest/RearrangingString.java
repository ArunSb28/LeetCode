package com.leetCodeContest;

import java.util.*;
public class RearrangingString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(arrangeWords("Keep calm and code on"));
	}
	
public static String arrangeWords(String text) {
        
	String[] s = text.split(" ");
	
	TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
	for(int i=0;i<s.length;i++) {
		if(tm.get(s[i].length())==null) {
			tm.put(s[i].length(), (s[i]+" ").toLowerCase());
		}
		else {
			
			String ne = tm.get(s[i].length()) +s[i]+" ";
			tm.put(s[i].length(), ne.toLowerCase());
		}
		
	}
	String fin = "";
	for(Map.Entry<Integer, String> en : tm.entrySet()) {
		fin =  fin+ en.getValue();
	}
	fin = fin.replaceFirst(fin.substring(0, 1),fin.substring(0, 1).toUpperCase());
	return fin.trim();
    }

}
