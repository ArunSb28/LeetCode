package com.leetCodeContest;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class PrefixInaSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrefixOfWord("hellohello hellohellohello", "ell"));
		
	}
	
    public static int isPrefixOfWord(String sentence, String searchWord) {
    	
    	if(sentence.length()==0 || searchWord.length()==0) {
    		return -1;
    	}
    	
    	String[] s = sentence.split(" ");
    	for(int i =0;i<s.length;i++) {
    		if(s[i].startsWith(searchWord)) {
    			return i+1;
    		}
    	}
        
        
    	return -1;
    }

    
    
  
}
