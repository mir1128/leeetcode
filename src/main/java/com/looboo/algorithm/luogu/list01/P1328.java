package com.looboo.algorithm.luogu.list01;

import java.util.Scanner;

public class P1328 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] result = solve(scanner);
        System.out.printf("%s %s%n", result[0], result[1]);
    }

    private static int[] solve(Scanner scanner) {
        int n = scanner.nextInt();
        int na = scanner.nextInt();
        int nb = scanner.nextInt();

        int[] sa = new int[na];
        for (int i = 0; i < na; i++) {
            sa[i] = scanner.nextInt();
        }

        int[] sb = new int[nb];
        for (int i = 0; i < nb; i++) {
            sb[i] = scanner.nextInt();
        }

        int[][] rule = new int[][] {
                {0, 0, 1, 1, 0},
                {1, 0, 0, 1, 0},
                {0, 1, 0, 0, 1},
                {0, 0, 1, 0, 1},
                {1, 1, 0, 0, 0},
        };

        int ca = 0;
        int cb = 0;
        for (int i = 0; i < n; i++) {
            if (rule[sa[(i + na) % na]][sb[(i + nb) % nb]] == 1) {
                ca++;
            } else if (rule[sb[(i + nb) % nb]][sa[(i + na) % na]] == 1) {
                cb++;
            }
        }

        return new int[] {ca, cb};
    }
}
