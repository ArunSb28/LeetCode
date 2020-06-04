package com.leetCodeMay;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
	public static void main(String[] args) {
		
		int[] num = {-1,-2,-3,-4,-5};
		for(int i: twoSums(num)) {
		
			System.out.println(i);
		}
		
	}
	
	public static int[] twoSums(int[] nums) {
		
	//	Arrays.parallelSort(arr);
		int[] a = new int[2];
		int target = -8;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++) {
			int comp = target - nums[i];
					if(hm.containsKey(comp)) {
						return new int[] {hm.get(comp),i};
					}
					hm.put(nums[i], i);
		}
		
		return a;
	}

}
