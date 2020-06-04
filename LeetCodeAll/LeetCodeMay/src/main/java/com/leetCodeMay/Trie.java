package com.leetCodeMay;

public class Trie {
	
	Trie[] children = new Trie[26];
	boolean isEndOfWord;
	  public Trie() {
	        isEndOfWord = false;
	        for(int i=0;i<26;i++) {
	        	children[i] = null;
	        }
	    }	
	    
	  
	    /** Inserts a word into the trie. */
	    public void insert(String word) {
	        
	    	System.out.println("Inserting the word"+ word);
	    	int level;
	    	int length = word.length();
	    	int index;
	    	Trie curr= this;
	    	for(level =0;level<length;level++) {
	    		
	    		index = word.charAt(level)-'a';
	    		if(curr.children[index]==null) {
	    			curr.children[index]= new Trie();
	    		}
	    		curr = curr.children[index];
	    		
	    	}
	    	curr.isEndOfWord = true;
	    }
	    
	    /** Returns if the word is in the trie. */
	    public boolean search(String word) {
	    	int level;
	    	int length = word.length();
	    	int index;
	    	Trie curr= this;
	    	for(level =0;level<length;level++) {
	    		index = word.charAt(level)-'a';
	    		if(curr.children[index]==null)
	    			{
	    			return false;
	    			}
	    		curr = curr.children[index];
	    	}
	    	
	    	return (curr!=null&&curr.isEndOfWord);
	    }
	    
	    /** Returns if there is any word in the trie that starts with the given prefix. */
	    public boolean startsWith(String prefix) {
	    	int level;
	    	int length = prefix.length();
	    	int index;
	    	Trie curr= this;
	    	for(level =0;level<length;level++) {
	    		index = prefix.charAt(level)-'a';
	    		if(curr.children[index]==null)
	    			{
	    			return false;
	    			}
	    		curr = curr.children[index];
	    	}
	    	
	    	return true;
	
	    }

}
