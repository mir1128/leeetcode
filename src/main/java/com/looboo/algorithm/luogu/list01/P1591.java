package com.looboo.algorithm.luogu.list01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P1591 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] result = solve(scanner);
        Arrays.stream(result, 0, result.length).forEach(System.out::println);
    }

    private static int[] solve(Scanner scanner) {
        int n = scanner.nextInt();

        int[][] input = IntStream
                .range(0, n)
                .mapToObj(i -> new int[]{scanner.nextInt(), scanner.nextInt()})
                .toArray(int[][]::new);

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = count(factorial(input[i][0]), input[i][1]);
        }
        return result;
    }

    private static int count(String s, int n) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == n) count++;
        }
        return count;
    }

    private static String factorial(int n) {
        String m = "1";
        for (int i = 1; i <=n ; i++) {
            m = mul(m, i);
        }
        return m;
    }

    private static String mul(String first, int second) {
        int c = 0;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = first.length() - 1; i >=0 ; i--) {
            int temp = (first.charAt(i) - '0') * second + c;
            c = temp / 10;
            stringBuilder.insert(0, temp % 10);
        }
        if (c != 0) {
            stringBuilder.insert(0, c);
        }
        return stringBuilder.toString();
    }
}
