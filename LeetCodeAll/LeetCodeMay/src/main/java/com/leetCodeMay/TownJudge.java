package com.leetCodeMay;


import java.util.*;

public class TownJudge {
	
	public static void main(String[] args) {
		
		int[][] trust = new int[1][2];
		trust[0][0] = 1;
		trust[0][1] = 2;
		System.out.println(findJudge(2, trust));
	}
	
	public static int findJudge(int N, int[][] trust)
	{
        if(trust.length<  N-1){
            return -1;
        }
        
        int [] inEdges = new int[N+1];
        int [] outEdges =new int[N+1];
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int[] relation :trust){
        	System.out.println(relation[0]);
            outEdges[relation[0]]++;
            inEdges[relation[1]]++;
            if(inEdges[relation[1]]==N-1) {
            	ar.add(relation[1]);
            }
        }
        System.out.println(ar.size());
        System.out.println(ar.get(0));
        for (int i = 1; i <= N; i++) {
        if (inEdges[i] == N - 1 && outEdges[i] == 0) {
            return i;
        }
    }
        
        return -1;


}
	
}