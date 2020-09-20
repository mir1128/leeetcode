package com.looboo.algorithm.leetcode;

public class FindMaxForm474_1 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int[] count = countzeroesones(s);
            for (int zeroes = m; zeroes >= count[0]; zeroes--)
                for (int ones = n; ones >= count[1]; ones--)
                    dp[zeroes][ones] = Math.max(1 + dp[zeroes - count[0]][ones - count[1]], dp[zeroes][ones]);
        }
        return dp[m][n];
    }

    public int[] countzeroesones(String s) {
        int[] c = new int[2];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - '0']++;
        }
        return c;
    }

    public static void main(String[] args) {
//        String arr[] = {"0","1101","01","00111","1","10010","0","0","00","1","11","0011"};
//        int maxForm = new FindMaxForm474_1().findMaxForm(arr, 63, 36);
        String arr[] = {"10", "0", "1"};
        int maxForm = new FindMaxForm474_1().findMaxForm(arr, 1, 1);

        System.out.println(maxForm);
    }
}
