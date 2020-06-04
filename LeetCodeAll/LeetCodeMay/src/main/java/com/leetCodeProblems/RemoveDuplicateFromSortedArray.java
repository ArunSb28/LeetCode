package com.leetCodeProblems;

public class RemoveDuplicateFromSortedArray {
	
	public static void main(String[] args) {
		
		
		int[] num = {1,1,1,2,2,2,3,4,5,6,7,8,9,9,9,9,9,9,10};
		int c =removeDuplicates(num);
	for(int k=0;k<c;k++) {
		System.out.println(num[k]);
	}
	}

	private static int removeDuplicates(int[] num) {
	
		if(num.length<2) {
			return num.length;
		}
		int count = 1;
		for(int i=0;i<num.length-1;i++) {
			if(num[i]!=num[i+1]) {
				num[count]= num[i+1];
				count++;
			}	
}
		return count;
		}
	
}