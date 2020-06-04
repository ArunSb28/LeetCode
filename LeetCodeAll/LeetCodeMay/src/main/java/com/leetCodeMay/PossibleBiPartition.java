package com.leetCodeMay;

import java.util.LinkedList;

public class PossibleBiPartition {
	
	public static void main(String[] args) {
		System.out.println(possibleBipartition(4, new int[][] {{1,2},{1,3},{2,4}}));
	}
	
	 public static boolean possibleBipartition(int N, int[][] dislikes) {
	     if(dislikes.length==0) {
	    	 return false;
	     }
		 
	     boolean val = true;
	     LinkedList<Integer> left = new LinkedList<Integer>();
	     LinkedList<Integer> right = new LinkedList<Integer>();
		 
	     if(dislikes[0][0]!=dislikes[0][1]) {
	    	 left.add(dislikes[0][0]);
	    	 left.add(-dislikes[0][1]);
	    	 right.add(dislikes[0][1]);
	    	 right.add(-dislikes[0][0]);
	    	 val = true;
	     }
	     else {
	    	 val = false;
	     }
	     System.out.println(left);
	     System.out.println(right);
	     for(int i=1;i<dislikes.length;i++) {
	    
	   
	    	 
	     }
	     
	     
		 
		 return val;
	    }

}
