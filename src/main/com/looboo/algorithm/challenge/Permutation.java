package com.looboo.algorithm.challenge;

public class Permutation<T> {

    public static <T> void printAllRecursive(int n, T[] elements) {
        if (n == 1) {
            printArray(elements);
        } else {
            for (int i = 0; i < n - 1; i++) {
                printAllRecursive(n - 1, elements);
                if (n % 2 == 0) {
                    swap(elements, i, n - 1);
                } else {
                    swap(elements, 0, n - 1);
                }
            }
            printAllRecursive(n - 1, elements);
        }
    }

    private static <T> void swap(T[] input, int a, int b) {
        T tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }

    private static <T> void printArray(T[] input) {
        System.out.print('\n');
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
    }
}
