package com.leetCodeContest;

public class MaxNumOfVowelsInSubString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//System.out.println(isPrefixOfWord("hellohello hellohellohello", "ell"));
	
	}
	
	 public static int maxVowels(String s, int k) {
	        if(s.length()==0||k==0) {
	        	return 0;
	        }
	        
	        char[] temp = s.toCharArray();
	        int count =0;
	        for(int i = 0;i<k+1;i++) {
	        	if(temp[i]=='a' ||  temp[i]=='e' || temp[i]=='i' || temp[i]=='o' || temp[i]=='u') {
        			count++;
        		}
	        }
	        int max = count;
	        
	        for(int i=k;i<s.length();i++) {
	    
	      	
	        	if(temp[i]=='a' ||  temp[i]=='e' || temp[i]=='i' || temp[i]=='o' || temp[i]=='u') {
        			count++;
        		}
	        	if(temp[i-k]=='a' ||  temp[i-k]=='e' || temp[i-k]=='i' || temp[i-k]=='o' || temp[i-k]=='u') {
        			count--;
        		}
	        	
	        	if(max<count) max = count;
	        }
	        
		 
		 return max;
	    }
	
	
}
