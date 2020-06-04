package com.leetCodeJune;

import java.util.Arrays;

public class TwoCityScheduling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] costs = { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };
		System.out.println(twoCitySchedCost(costs));
	}

	public static int twoCitySchedCost(int[][] costs) {
		int sum = 0;
		int[][] dp = new int[costs.length][2];

		for (int i = 0; i < costs.length; i++) {
			dp[i][0] = costs[i][0] - costs[i][1];
			dp[i][1] = i;
		}
		Arrays.sort(dp, (o1, o2) -> {
			if (o1[0] > o2[0]) {
				return 1;
			} else {
				return -1;
			}
		});

		for (int i = 0; i < costs.length; i++) {
			if (i <= ((costs.length / 2) - 1)) {
				sum = sum + costs[dp[i][1]][0];
			} else {
				sum = sum + costs[dp[i][1]][1];
			}
		}

		return sum;

	}

}
