package com.leetCodeContest;

public class StudentsDoingHomeWorkAtATime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
	}
	
	
	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
      
		int count =0;
		
		for(int i=0;i<startTime.length;i++) {
			if(startTime[i]<=queryTime && endTime[i]>= queryTime) {
				count++;
			}
			
		}
		
		
		
		return count;
    }

}
