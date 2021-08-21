package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class ShipWithinDays1011 {
    public int shipWithinDays(int[] weights, int D) {
        int left = max(weights);
        int right = sum(weights);

        while (left < right) {
            int mid = left + (right - left) / 2;
            int day = days(weights, mid);
            if (day > D) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int days(int[] weights, int mid) {
        int sum = 0;
        int result = 0;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] == mid) {
                result += 1;
                sum = 0;
            } else if (sum + weights[i] > mid) {
                sum = weights[i];
                result += 1;
            } else {
                sum += weights[i];
            }
        }
        if (sum != 0) {
            result += 1;
        }
        return result;
    }

    private int max(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    private int sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
