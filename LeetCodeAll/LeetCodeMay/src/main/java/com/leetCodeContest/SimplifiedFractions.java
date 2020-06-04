package com.leetCodeContest;

import java.util.*;
public class SimplifiedFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(simplifiedFractions(92));
	}
	
	public static List<String> simplifiedFractions(int n){
		List<String> s = new ArrayList<String>();
		if(n<2) {
			return s;
		}
		
		List<Double> d = new ArrayList<Double>();
		for(int i=1;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				double val = ((double)i/(double)j);
				if(i%j!=0  && d.indexOf(val)==-1 && val<1) {
					String s1 = Integer.toString(i)+"/"+Integer.toString(j);
					s.add(s1);
					d.add(val);
				}
				
			}
		}
		
		
		return s;
	}

}
