package com.leetCodeProblems;

public class RemoveDuplicatesFromSortedArrayII {
	
	public static void main(String[] args) {
		
		
		int[] num = {0,0,1,1,1,1,2,2,3,3,4,4,4,4,4,4,5,5};
		int c =removeDuplicates(num);
	for(int k=0;k<c;k++) {
		System.out.println(num[k]);
	}
	//	System.out.println(removeDuplicatesArr(num));
	}
	
	
	public static int removeDuplicates(int[] nums) {
		
		if(nums.length<=2) {
			return 0;
		}
	//	int[] num1 = {0,0,1,1,1,1,2,2,3,3,4,4,4,4,4,4,5,5};
		int start = 0;
		int count = 1;
		boolean dups = false;
		for(int i =1;i<nums.length;i++) {
			if(nums[start]==nums[i] && !dups) {
				nums[count] = nums[i];
				count++;
				dups = true;
			}
			else if(nums[start]!=nums[i]) {
				nums[count] = nums[i];
				count++;
				start =i;
				dups = false;
			}			
		}
	
		return count;
	}
	
public static int removeDuplicatesArr(int[] nums) {
		
		if(nums.length<=2) {
			return nums.length;
		}
		
		int lastHigh = nums[0];
		int count = 1;
		boolean dups = false;
		for(int i=1;i<nums.length;i++) {
			
		}
		for(int k=0;k<nums.length;k++) {
			System.out.println(nums[k]);
		}
	
		return count;
	}

}
