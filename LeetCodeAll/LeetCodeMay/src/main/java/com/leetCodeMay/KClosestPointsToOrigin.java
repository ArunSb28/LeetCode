package com.leetCodeMay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class KClosestPointsToOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int[][] kClosest(int[][] points, int K) {
		
		 int[][] out = new int[K][];
		 if(K<=0 || points.length==0) {
			 return null;
		 }
		 	
	        TreeMap<Integer,List<Integer>> hm = new TreeMap<Integer,List<Integer>>();
		 for(int i=0;i<points.length;i++) {
			 int val = (int)Math.pow(points[i][0], 2)+(int)Math.pow(points[i][1], 2);
			 
			 if(hm.get(val)==null) {
				 List<Integer> li = new ArrayList<Integer>();
				 li.add(i);
				 hm.put(val, li);
			 }
			 else {
				 List<Integer> n = hm.get(val);
				 n.add(i);
			 }
		 }
	      System.out.println(hm);  
		int i =0;
		 while(K>0) {
			 for(Map.Entry<Integer, List<Integer>> en: hm.entrySet()) {
				 List<Integer> data = en.getValue();
				 Iterator it = data.iterator();
				 while(it.hasNext()&&K>0) {
					 	out[i] = (int[]) it.next();
					 	K--;
					 	i++;
				 }
				 if(K==0) {
					 break;
				 }
			 }
		 }
		 
		 
		 
		 return out;
	    }

}
