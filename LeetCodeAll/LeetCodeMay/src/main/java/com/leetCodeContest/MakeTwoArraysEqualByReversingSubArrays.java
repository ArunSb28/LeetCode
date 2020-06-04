package com.leetCodeContest;

import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubArrays {

	
	public static void main(String[] args) {
		
	}
	
	   public static boolean canBeEqual(int[] target, int[] arr) {
	        
		   Arrays.parallelSort(arr);
		   Arrays.parallelSort(target);
		   
		   if(arr.length!=target.length || arr.length==0|| target.length==0) {
			   return false;
		   }
		   
		   for(int i=0;i<arr.length;i++) {
			   if(arr[i]!=target[i]) {
				   return false;
			   }
		   }
		   
		   return true;	
	    }
	
}
