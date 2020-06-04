package com.leetCodeProblems;


import java.util.*;

public class RandomizedSetMain {
	
	public static class RandomizedSet{
		
		HashMap<Integer,Integer> hm;
		HashMap<Integer,Integer> im;
		 public RandomizedSet() {
		        
			 hm = new HashMap<Integer, Integer>();
			 im = new HashMap<Integer, Integer>();
			 
		    }
		    
		    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
		    public boolean insert(int val) {
		     
		    	if(hm.get(val)!=null) {
		    		return false;
		    	}
		    	hm.put(val, hm.size());
		    	im.put(im.size(), val);
		    	return true;
		    }
		    
		    /** Removes a value from the set. Returns true if the set contained the specified element. */
		    public boolean remove(int val) {
		        
		    	if(hm.containsKey(val)) {
		    		
		    		int index = hm.get(val);
		    		hm.remove(val);
		    		im.remove(index);
		    		
		    		Integer tail = im.get(im.size());
		    		if(tail!=null) {
		    			im.put(index,tail);
		    			hm.put(tail, index);
		    		}
		    		return true;
		    	}
		    	return false;
		    }
		    
		    /** Get a random element from the set. */
		    public int getRandom() {
		        
		    	if(hm.size()==0) {
		    		return -1;
		    	}
		    	if(hm.size()==1) {
		    		return im.get(0);
		    	}
		    	
		    	Random rand = new Random();
		    	int index = rand.nextInt(hm.size());
		    	
		    	return im.get(index);
		    }
	}
	
	public static void main(String[] arg) {
		
		
		RandomizedSet r = new RandomizedSet();
		
		System.out.println(r.remove(0));
		System.out.println(r.remove(0));
		System.out.println(r.insert(0));
		System.out.println(r.getRandom());
		System.out.println(r.remove(0));
		System.out.println(r.insert(0));
	}

}
