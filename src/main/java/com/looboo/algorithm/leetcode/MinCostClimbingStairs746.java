package com.looboo.algorithm.leetcode;

public class MinCostClimbingStairs746 {
    public int minCostClimbingStairs(int[] cost) {

        int length = cost.length;
        if (length == 1) return cost[0];
        if (length == 0) return 0;

        int total[] = new int[length];

        total[0] = cost[0];
        total[1] = cost[1];

        for (int i = 2; i < length; ++i) {
            total[i] = Math.min(total[i-1], total[i-2]) + cost[i];
        }

        return Math.min(total[length-1], total[length-2]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};

        int i = new MinCostClimbingStairs746().minCostClimbingStairs(arr);
        System.out.println(i);
    }
}
