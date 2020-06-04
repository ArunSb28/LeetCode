package com.leetCodeMay;

import java.util.HashMap;

public class ContigousArraysOF0and1 {
	
	public static void main(String[] args) {
		System.out.println(findMaxLength(new int[]{0,1}));
	}
	
	public static int findMaxLength(int[] nums) {
		if(nums.length<2) {
			return 0;
		}
		int max = 0;
		int sum =0;
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, -1);
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]==0) {
				sum+=-1;
			}
			else {
				sum+=1;
			}
			System.out.println(hm);
			if(hm.containsKey(sum)) {
				max = Math.max(max, i-hm.get(sum));
			}else {
				hm.put(sum, i);
			}
			System.out.println(hm);
		}
		
		
		return max;
    }

}
