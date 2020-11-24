package com.looboo.algorithm.leetcode;

public class MySqrt69 {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (left < right) {
            int mid = (int) (left + ((double) right - left + 1) / 2);
            if ((double) (mid) * (double) (mid) > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }
}
