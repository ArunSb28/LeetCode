package com.leetCodeContest;

import java.util.Arrays;

public class MaxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxProduct(int[] nums) {
		if (nums.length < 2) {
			return 0;
		}

		Arrays.parallelSort(nums);
		return ((nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1));
	}
}
