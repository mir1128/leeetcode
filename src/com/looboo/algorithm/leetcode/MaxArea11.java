package com.looboo.algorithm.leetcode;

public class MaxArea11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int result = 0;
        while (left < right) {
            int current = (right - left) * Math.min(height[left], height[right]);
            if (result < current) {
                result = current;
            }

            if (height[left] <  height[right]) {
                ++left;
                continue;
            } else {
                --right;
                continue;
            }
        }
        return result;
    }
}
