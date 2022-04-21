package com.looboo.algorithm.luogu.list03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class P1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r = scanner.nextInt();

        List<int[]> result = new ArrayList<>();
        for (int i = (1 << n) - 1; i >= 0; i--) {
            int bitCount = Integer.bitCount(i);
            if (bitCount == r) {
                int[] oneResult = new int[r];

                int m = 0;
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0) {
                        oneResult[m++] = j;
                    }
                }
                result.add(oneResult);
            }
        }
        for (int[] ints : result) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = ints.length - 1; i >= 0; i--) {
                stringBuilder.append(String.format("%3s", n - ints[i]));
            }
            System.out.println(stringBuilder);
        }
    }
}
