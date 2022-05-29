package com.looboo.algorithm.luogu.listmath22;

import java.util.Scanner;

public class P1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(stackPopCount(n));
    }

    private static int stackPopCount(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = 0; j <= i - 1; j++) {
                sum += dp[j] * dp[i-1-j];
            }
            dp[i] = sum;
        }
        return dp[n];
    }
}
