package com.leetCodeContest;

import java.util.*;

public class FavouriteCompanySubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
	        
		int len = favoriteCompanies.size();
		List<Integer> li = new ArrayList<Integer>();
		Set<String> hs = new HashSet<String>();
		
		Collections.sort(favoriteCompanies, new Comparator<List<String>>() {


			@Override
			public int compare(List<String> o1, List<String> o2) {
				// TODO Auto-generated method stub
				return o2.size()-o1.size();
			}
			
		});
		
		for(int i=0;i<len;i++) {
		boolean bool = false;	
			for(int j=0;j<favoriteCompanies.get(i).size();i++) {
				boolean yes = hs.add(favoriteCompanies.get(i).get(j));
			if(yes) {
				bool = true;
			}
			}
		if(bool) {
			li.add(i);
		}	
		}
		 return li;
	    }

}
