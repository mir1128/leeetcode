package com.looboo.algorithm.leetcode;

public class CountTriplets1442 {
    public int countTriplets(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            for (int j = i; j < arr.length; j++) {
                a ^= arr[j];
                int b = 0;
                for (int k = j + 1; k < arr.length; k++) {
                    b ^= arr[k];
                    if (a == b)
                        count++;
                }
            }
        }
        return count;
    }
}
