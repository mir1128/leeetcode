package com.looboo.algorithm.leetcode;

public class CountSubstrings647 {
    public int countSubstrings(String s) {

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            sum += len(s, i, i);
            sum += len(s, i, i + 1);
        }

        return sum + 1;
    }

    private int len(String s, int p1, int p2) {
        int n = 0;
        while (p1 - n >= 0 && p2 + n < s.length() && s.charAt(p1 - n) == s.charAt(p2 + n)) {
            ++n;
        }
        return n;
    }

    public int countSubstrings1(String s) {

        int n = s.length();
        int count = 0;
        boolean[][] dp = new boolean[n][n];

        for (int len = 1; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                if (len == 1) {
                    dp[start][start] = true;
                    count += 1;
                } else if (len == 2) {
                    if (s.charAt(start) == s.charAt(start + 1)) {
                        dp[start][start + 1] = true;
                        count += 1;
                    }
                } else {
                    if (s.charAt(start) == s.charAt(start + len - 1)) {
                        if (dp[start + 1][start + len - 2]) {
                            dp[start][start + len - 1] = true;
                            count += 1;
                        }
                    }
                }
            }
        }
        return count;
    }


}
