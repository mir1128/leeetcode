package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class StoneGameVII {
    public int stoneGameVII(int[] stones) {

        int alice = 0;
        int bob = 0;

        int left = 0;
        int right = stones.length-1;

        int sum = Arrays.stream(stones).sum();

        for (int i = 0; i < stones.length; i++) {
            if (i % 2 == 0) {
                if (stones[left] < stones[right]) {
                    sum -= stones[left];
                    alice += sum;
                    left++;
                } else {
                    sum -= stones[right];
                    alice += sum;
                    right--;
                }
            } else {
                if (stones[left] < stones[right]) {
                    sum -= stones[left];
                    bob += sum;
                    left++;
                } else {
                    sum -= stones[right];
                    bob += sum;
                    right--;
                }
            }
        }

        return alice - bob;
    }
}
