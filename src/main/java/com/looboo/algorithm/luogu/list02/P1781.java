package com.looboo.algorithm.luogu.list02;

import java.util.Comparator;
import java.util.Scanner;

public class P1781 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] votes = new String[n];

        for (int i = 0; i < n; i++) {
            votes[i] = scanner.next();
        }

        Comparator<String> comparator = Comparator
                .comparing(String::length)
                .thenComparing(String::compareTo);

        String max = votes[0];

        int index = 0;
        for (int i = 1; i < n; i++) {
            if (comparator.compare(max, votes[i]) < 0) {
                max = votes[i];
                index = i;
            }
        }

        System.out.println(index + 1);
        System.out.println(max);
    }


}
