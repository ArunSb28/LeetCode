package com.leetCodeMay;

public class MedianOfSortedArray {

	public static void main(String[] args) {
		
	}
	
	  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		  double num1=0,num2=0;
		  int n1 = nums1.length;
		  int n2 = nums2.length;
		  		  
		  if((n1+n2)%2!=0) {
			  
		  }
		  else {
			  num1 = (double)((nums1[(n1-1)/2]+nums1[(n1/2)])/2);
		  }
		  
		  
		  
		  return (n1+n2)/2;
	  }
	
}
