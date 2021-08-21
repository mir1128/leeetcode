package com.looboo.algorithm.leetcode;

public class GetMoneyAmount375 {
    public int getMoneyAmount(int n) {
        int left = 1;
        int right = n;
        int res = 0;

        while (left < right) {
            int mid = left + (right - left) / 2;

            res += mid;

            left = mid + 1;
        }
        return res;
    }
}
