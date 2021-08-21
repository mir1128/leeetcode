package com.looboo.algorithm.leetcode;

public class KInversePairs629 {
    public int kInversePairs(int n, int k) {
        int arr[][] = new int[n + 1][k + 1];
        int mod = 1000000007;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k && j <= (i - 1) * i / 2; j++) {
                if (j == 0) {
                    arr[i][j] = 1;
                    continue;
                }

                int val = (arr[i - 1][j] - (j - i < 0 ? 0 : arr[i - 1][j - i]) + mod) % mod;
                arr[i][j] = (arr[i][j - 1] + val) % mod;
            }
        }
        return arr[n][k];
    }

    public static void main(String[] args) {
        System.out.println(new KInversePairs629().kInversePairs(1000, 1000));
    }
}

