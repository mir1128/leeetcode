package com.looboo.algorithm.leetcode;

public class CountVowelStrings {
    public int countVowelStrings(int n) {
        return 5
                + 10 * fact(n - 1, 2 - 1)
                + 10 * fact(n - 1, 3 - 1)
                + 5 * fact(n - 1, 4 - 1)
                + fact(n - 1, 5 - 1);
    }

    private int fact(int n, int m) {

        if (m > n) return 0;

        int res = 1;
        for (int i = n; i >= n - m + 1; i--) {
            res *= i;
        }

        int k = 1;
        for (int i = 1; i <= m; i++) {
            k *= i;
        }
        return res / k;
    }

    public static void main(String[] args) {
        System.out.println(new CountVowelStrings().countVowelStrings(33));
    }
}
