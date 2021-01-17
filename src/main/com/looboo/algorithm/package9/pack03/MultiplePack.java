package com.looboo.algorithm.package9.pack03;

public class MultiplePack {
    public int multiplePack(int[] v, int[] w, int[] s, int V) {
        int n = v.length;

        int[] dp = new int[V + 1];
        for (int i = 0; i < n; i++) {
            if (s[i] * v[i] >= V) {
                for (int j = v[i]; j <= V; j++) {
                    dp[j] = Math.max(dp[j], dp[j - v[i]] + w[i]);
                }
            } else {
                int k = 1;
                while (k < s[i]) {
                    for (int j = V; j >= v[i] * k; j--) {
                        dp[j] = Math.max(dp[j], dp[j - v[i] * k] + w[i] * k);
                    }
                    k *= 2;
                }
                k /= 2;
                for (int j = V; j >= v[i] * (s[i] - k); j--) {
                    dp[j] = Math.max(dp[j], dp[j - v[i] * (s[i] - k)] + (s[i] - k) * w[i]);
                }
            }
        }
        return dp[V];
    }
}
