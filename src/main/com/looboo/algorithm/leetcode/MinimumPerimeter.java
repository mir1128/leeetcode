package com.looboo.algorithm.leetcode;

public class MinimumPerimeter {
    public long minimumPerimeter(long neededApples) {
        int left = 0;
        int right = 1000000;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (f(mid) < neededApples) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left * 8;
    }

    private long f(long n) {
        return 4 * n * n * n + 6 * n * n + 2 * n;
    }
}
