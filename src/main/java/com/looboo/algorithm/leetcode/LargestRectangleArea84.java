package com.looboo.algorithm.leetcode;

public class LargestRectangleArea84 {
    public int largestRectangleArea(int[] heights) {

        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            int left = i;
            while (left > 0 && heights[left - 1] >= heights[i]) --left;

            int right = i;
            while (right < heights.length - 1 && heights[right + 1] >= heights[i]) ++right;

            res = Math.max(res, (right - left + 1) * heights[i]);
        }

        return res;
    }

    public int largestRectangleArea1(int[] heights) {

        return 0;
    }
}
