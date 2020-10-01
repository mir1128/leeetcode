package com.looboo.algorithm.leetcode;

public class CountNumbersWithUniqueDigits357 {
    public int countNumbersWithUniqueDigits(int n) {

        if (n>=10) n = 10;

        int arr[] = new int[n + 1];

        arr[0] = 1;
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + 9 * factorial(i - 1);
        }

        return arr[n];
    }

    private int factorial(int n) {
        int result = 1;
        for (int i = (9 - n + 1); i <= 9; i++) {
            result *= i;
        }
        return result;
    }
}
