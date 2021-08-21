package com.looboo.algorithm.leetcode;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestPalindrome5 {

    public String manacher(String s) {

        String regularString = IntStream.range(0, s.length())
                .mapToObj(i -> String.valueOf(s.charAt(i)))
                .collect(Collectors.joining("#", "#", "#"));

        int[] p = new int[regularString.length()];

        int center = -1;
        int max = -1;
        int pi = -1;
        int pm = -1;

        for (int i = 0; i < regularString.length(); i++) {
            if (max <= i) {
                int len = length(regularString, i);
                p[i] = len;
                max = i + len - 1;
                center = i;
            } else {
                pi = 2 * center - i;
                pm = 2 * center - max;
                if (p[pi] > pi - pm + 1) {
                    p[i] = pi - pm + 1;
                } else if (p[pi] < pi - pm + 1) {
                    p[i] = p[pi];
                } else {
                    int len = length(regularString, i);
                    max = len + i - 1;
                    center = i;
                    p[i] = len;
                }
            }
        }

        int pos = 0;
        int maxLength = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] > maxLength) {
                maxLength = p[i];
                pos = i;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (regularString.charAt(pos) != '#') stringBuilder.append(regularString.charAt(pos));
        for (int i = 1; i < maxLength; i++) {
            if (regularString.charAt(pos + i) != '#') {
                stringBuilder.append(regularString.charAt(pos + i));
                stringBuilder.insert(0, regularString.charAt(pos + i));
            }
        }
        return stringBuilder.toString();
    }

    private int length(String s, int index) {
        int n = 1;
        while (index - n >= 0 && index + n < s.length() && s.charAt(index - n) == s.charAt(index + n)) ++n;
        return n;
    }


    public int longestPalindromeLength(String s) {

        int n = s.length();
        int[][] dp = new int[n][n];

        for (int len = 1; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                if (len == 1) {
                    dp[start][start] = 1;
                } else {
                    dp[start][start + len - 1] = Math.max(dp[start + 1][start + len - 1], dp[start][start + len - 2]);
                    if (s.charAt(start) == s.charAt(start + len - 1)) {
                        dp[start][start + len - 1] = Math.max(dp[start][start + len - 1], dp[start + 1][start + len - 2] + 2);
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}
