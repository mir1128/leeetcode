package com.looboo.algorithm.luogu.list02;

import java.util.Arrays;
import java.util.Scanner;

public class P2676 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long b = scanner.nextLong();

        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        Arrays.sort(height);

        long sum = 0;
        int index = n - 1;
        while (sum < b) {
            sum += height[index];
            --index;
        }
        System.out.println(n - index - 1);
    }
}
