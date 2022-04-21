package com.looboo.algorithm.luogu.list03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print(solve(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

    public static List<int[]> solve(int n1, int n2, int n3) {

        List<int[]> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == i) continue;
                for (int k = 1; k <= 9; k++) {
                    if (k == i || k == j) continue;
                    for (int l = 1; l <= 9; l++) {
                        if (l == i || l == j || l == k) continue;
                        for (int m = 1; m <= 9; m++) {
                            if (m == i || m == j || m == k || m == l) continue;
                            for (int n = 1; n <= 9; n++) {
                                if (n == i || n == j || n == k || n == l || n == m) continue;
                                for (int o = 1; o <= 9; o++) {
                                    if (o == i || o == j || o == k || o == l || o == m || o == n) continue;
                                    for (int p = 1; p <= 9; p++) {
                                        if (p == i || p == j || p == k || p == l || p == m || p == n || p == o)
                                            continue;
                                        for (int q = 1; q <= 9; q++) {
                                            if (q == i || q == j || q == k || q == l || q == m || q == n || q == o || q == p)
                                                continue;
                                            int a = 100 * i + 10 * j + k;
                                            int b = 100 * l + 10 * m + n;
                                            int c = 100 * o + 10 * p + q;
                                            if (a * n2 * n3 == b * n1 * n3 && b * n1 * n3 == c * n1 * n2) {
                                                result.add(new int[]{a, b, c});
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void print(List<int[]> result) {
        if (result.size() == 0) {
            System.out.println("No!!!");
            return;
        }
        result.forEach(ints -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (int anInt : ints) {
                stringBuilder.append(anInt).append(" ");
            }
            System.out.println(stringBuilder);
        });
    }
}
