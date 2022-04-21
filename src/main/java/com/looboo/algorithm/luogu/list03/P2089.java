package com.looboo.algorithm.luogu.list03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print(solve(scanner.nextInt()));
    }

    public static List<int[]> solve(int nextInt) {
        if (nextInt < 10 || nextInt > 30) return new ArrayList<>();

        List<int[]> result = new ArrayList<>();
        for (int i = 1; i <= 3; i++)
            for (int j = 1; j <= 3; j++)
                for (int k = 1; k <= 3; k++)
                    for (int l = 1; l <= 3; l++)
                        for (int m = 1; m <= 3; m++)
                            for (int o = 1; o <= 3; o++)
                                for (int p = 1; p <= 3; p++)
                                    for (int q = 1; q <= 3; q++)
                                        for (int r = 1; r <= 3; r++)
                                            for (int s = 1; s <= 3; s++)
                                                if (i + j + k + l + m + o + p + q + r + s == nextInt) {
                                                    result.add(new int[]{i, j, k, l, m, o, p, q, r, s});
                                                }

        return result;
    }

    public static void print(List<int[]> result) {
        System.out.println(result.size());
        result.forEach(ints -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (int anInt : ints) {
                stringBuilder.append(anInt).append(" ");
            }
            System.out.println(stringBuilder);
        });
    }

}
