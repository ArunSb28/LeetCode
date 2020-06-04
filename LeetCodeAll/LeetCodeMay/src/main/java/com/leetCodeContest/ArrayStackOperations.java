package com.leetCodeContest;

import java.util.*;;

public class ArrayStackOperations {
	
	public static void main(String[] args) {
		
		int[] target = {2,4};
		int n = 4;
		System.out.println(buildArray(target, n));
	}
	
	
	  public static List<String> buildArray(int[] target, int n) {
	        ArrayList<String> list = new ArrayList<String>();
	        
	        int i=0,j=1;
	        while(i<target.length) {
	        	
	        	if(j==target[i]) {
	        		list.add("push");
	        		j++;
	        		i++;
	        	}
	        	else
	        	{
	        		list.add("push");
	        		list.add("pop");
	        		//i++;
	        		j++;
	        	}
	        	
	        }
		  
		  return list;
	    }

}
