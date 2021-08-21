package com.looboo.algorithm.algo4;

import java.util.Scanner;

public class Session1_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        if (a1 == a2 && a2 == a3) {
            System.out.printf("equal");
        } else {
            System.out.printf("not equal");
        }
    }
}
