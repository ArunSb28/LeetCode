package com.leetCodeMay;

import java.util.*;

public class StockSpannerMain {

	 static class StockSpanner{
		
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> index = new Stack<>();
		public StockSpanner() {
		
		}
		
		public int next(int price) {
			int count =1;
			
			while(!stack.isEmpty()&&stack.peek()<=price) {
				//count+=stack.pop()[1];
				count += index.pop();
				stack.pop();
			}
			//stack.push(new int[] {price,count});
			stack.push(price);
			index.push(count);
			return count;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StockSpanner S = new StockSpanner();
	System.out.println(S.next(28));
	System.out.println(S.next(14));
	System.out.println(S.next(28));
	System.out.println(S.next(35));
	System.out.println(S.next(46));
	System.out.println(S.next(53));
	System.out.println(S.next(66));
	System.out.println(S.next(80));
	System.out.println(S.next(87));
	System.out.println(S.next(88));
	
		
	}

}
