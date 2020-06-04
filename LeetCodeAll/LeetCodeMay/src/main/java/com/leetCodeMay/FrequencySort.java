package com.leetCodeMay;

import java.util.*;

public class FrequencySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(frequencySort("aaaaaaaccABBBBBbbbbbBBB"));
	}
	
	public static String frequencySort(String s) {
		
		Map<Character,Integer> hm = new HashMap<Character,Integer>();	
		for(int i=0;i<s.length();i++) {
			char temp = s.charAt(i);
		hm.put(temp, hm.getOrDefault(temp, 0)+1);
		}	
	
		PriorityQueue<Character> pq = new PriorityQueue<Character>((a,b)-> hm.get(b)-hm.get(a));
		pq.addAll(hm.keySet());
		StringBuilder sb = new StringBuilder();
		
		while(!pq.isEmpty()) {
			char curr = pq.remove();
			for(int i=0;i<hm.get(curr);i++) {
				sb.append(curr);
			}
		}
		return sb.toString();
	}

}
