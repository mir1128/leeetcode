package com.looboo.algorithm.luogu.list02;

import java.util.Random;
import java.util.Scanner;

public class P1177 {

    private final static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        quickSort3Ways(array);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(array[i]).append(" ");
        }
        System.out.println(sb);
    }

    public static void quickSort3Ways(int[] arr) {
        quickSort3WaysInternal(arr, 0, arr.length - 1);
    }

    private static void quickSort3WaysInternal(int[] arr, int left, int right) {
        if (left >= right) return;

        int rnd = random.nextInt(right - left + 1) + left;
        swap(arr, rnd, left);

        int lt = left;
        int gt = right + 1;

        int i = lt;

        while (i < gt) {
            if (arr[i] == arr[left]) i++;
            else if (arr[i] > arr[left]) {
                swap(arr, i, --gt);
            } else {
                swap(arr, ++lt, i++);
            }
        }

        swap(arr, left, lt);

        quickSort3WaysInternal(arr, left, lt);
        quickSort3WaysInternal(arr, gt, right);
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
