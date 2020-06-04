package com.leetCodeProblems;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void rotate(int[] nums, int k) {

		if ((k == 0) || (k == nums.length) || ((k % nums.length) == 0)) {
			nums = nums;
		}

		else if (k > nums.length) {
			k = k % nums.length;
		} else {
//			nums = nums.
		}

	}
}
