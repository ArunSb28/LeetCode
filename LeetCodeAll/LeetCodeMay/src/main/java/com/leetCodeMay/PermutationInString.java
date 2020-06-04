package com.leetCodeMay;

public class PermutationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkInclusion("ab", "eidbaooo"));
		
	}
	
    public static boolean checkInclusion(String s1, String s2) {
     
    	if(s1.length()==0|| s2.length()==0 || s2.length()<s1.length()) {
    		return false;
    	}
    	
			int[] pArr = new int[26];
			int[] sArr = new int[26];
			
			int pLen = s1.length();
			int sLen = s2.length();
			
			for(int i=0;i<pLen;i++) {
				pArr[s1.charAt(i)-'a'] = pArr[s1.charAt(i)-'a'] +1 ;
				sArr[s2.charAt(i)-'a'] = sArr[s2.charAt(i)-'a'] +1 ;
			}
			
			for(int i=pLen;i<sLen;i++) {
				
				if(compare(pArr, sArr)) {
					return true;
				}
				sArr[s2.charAt(i)-'a']+=1;
				sArr[s2.charAt(i-pLen)-'a']-=1;
				
			}
			if(compare(pArr, sArr)) {
				return true;
			}
     	
   	return false;
    }
	public static boolean compare(int[] pArr, int[] sArr) {
		
		for(int i=0;i<26;i++) {
			if(pArr[i]!=sArr[i])
				return false;
		}
		
		return true;
	}

}
