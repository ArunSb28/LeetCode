package com.leetCodeMay;

import java.util.*;

import javax.print.attribute.HashAttributeSet;


public class MajorityElement {
	
public static void main(String[] args) {
	
	int[] arr = {1,9,9,9,9,9,9,9,9,9};
	//System.out.println(majorityElement(arr));
	
	String s1 = "";
	for(int i=arr.length-1;i>=0;i--) {
		s1 = s1+Integer.toString(arr[i]);
	}
	System.out.println(Long.parseLong(s1));
}

public static int majorityElement(int[] nums) {
	
	
	HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
	int num =0;
	int max = 0;
	int i =0;
	if(nums.length==1) {
		return nums[0];
	}
	else {
		
	
	while(max<=(nums.length/2)){
		
		if(hm.get(nums[i])==null) {
			hm.put(nums[i], 1);
		}
		else {
			int sum = Integer.parseInt(hm.get(nums[i]).toString())+1;
			hm.put(nums[i], sum);
			if(max<sum) {
				max = sum;
				num = nums[i];
			}
		}
		i++;
	}
	}
	return num;
}

}

