package com.leetCodeProblems;

public class BestSightseeingPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {6,9,10,5,9,10,4,5};
		System.out.println(maxScore(A));
	}
	
	public static int maxScore(int[] A) {
		if(A.length<=1) {
			return 0;
		}
		
		int max = 0;
		int start = 0;
		int end = A.length-1;
		while(start<end) {
		int temp = A[start]+A[end]+start - end;
			if(max<temp) {
				max = temp;
			}
				if(A[end]>A[start]) {
				start++;
				}
				else if(A[end]==A[start]) {
					if(A[end-1]>A[start+1]) {
						start++;
					}
					else {
						end--;
					}
					
				}
				else {
					end--;
				}
			
			
			
		}
		return max;
	}

}
