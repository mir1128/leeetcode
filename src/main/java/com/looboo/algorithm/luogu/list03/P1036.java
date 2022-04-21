package com.looboo.algorithm.luogu.list03;

import java.util.Scanner;

public class P1036 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(solve(nums, k));
    }

    public static int solve(int[] nums, int k) {
        int n = nums.length;

        int s = 1 << n;

        int result = 0;
        for (int u = 0; u < s; u++) {
            if (Integer.bitCount(u) == k) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    if ((1 << i & u) != 0) {
                        sum += nums[i];
                    }
                }
                if (isPrime(sum)) result++;
            }
        }
        return result;
    }

    private static boolean isPrime(int sum) {
        for (int i = 2; i * i <= sum; i++) {
            if (sum % i == 0) return false;
        }
        return true;
    }
}
