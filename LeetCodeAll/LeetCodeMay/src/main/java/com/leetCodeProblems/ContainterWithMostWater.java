package com.leetCodeProblems;

public class ContainterWithMostWater {
	
	public static void main(String[] args) {
		
		 int[] nums = {2,1,3,4}; 
		 System.out.println(maxArea(nums));
	}
	
	
	public static int maxArea(int[] height) {
        
			if(height.length<=1) {
				return 0;
			}
			int l =0;
			int r = height.length-1;
			int area =0;
			while(l<r) {
				area = Math.max(area, Math.min(height[l], height[r])*(r-l));
				if(height[l]<height[r]) {
					l=l+1;
				}
				else {
					r = r-1;
				}
			}
			
			return area;
    }

}
