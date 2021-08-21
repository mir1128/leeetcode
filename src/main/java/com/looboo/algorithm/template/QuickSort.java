package com.looboo.algorithm.template;

import java.util.Random;

public class QuickSort {
    private static Random random = new Random();

    public static void quickSort1(int[] arr) {
        quickSort1Internal(arr, 0, arr.length - 1);
    }

    private static void quickSort1Internal(int[] arr, int left, int right) {
        if (left >= right) return;

        int p = partition1(arr, left, right);

        quickSort1Internal(arr, left, p - 1);
        quickSort1Internal(arr, p + 1, right);
    }

    private static int partition1(int[] arr, int left, int right) {
        int rnd = random.nextInt(right - left + 1) + left;

        swap(arr, rnd, left);

        int i = left;
        for (int j = left + 1; j <= right; j++) {
            if (arr[j] < arr[left]) {
                swap(arr, ++i, j);
            }
        }
        swap(arr, left, i);
        return i;
    }

    public static void quickSort2ways(int[] arr) {
        quickSort2ways(arr, 0, arr.length - 1);
    }

    private static void quickSort2ways(int[] arr, int left, int right) {
        if (left >= right) return;

        int rnd = random.nextInt(right - left + 1) + left;

        swap(arr, rnd, left);

        int i = left + 1;
        int j = right;
        while (true) {
            while (i <= right && arr[i] < arr[left]) i++;
            while (j >= left + 1 && arr[j] > arr[left]) j--;
            if (i > j) break;
            swap(arr, i, j);
            i++;
            j--;
        }
        swap(arr, left, j);

        quickSort2ways(arr, left, j - 1);
        quickSort2ways(arr, j + 1, right);
    }

    public static void quickSort3ways(int[] arr) {
        quickSort3ways(arr, 0, arr.length - 1);
    }

    private static void quickSort3ways(int[] arr, int left, int right) {
        if (left >= right) return;

        int rnd = random.nextInt(right - left + 1) + left;

        swap(arr, rnd, left);

        int lt = left;
        int gt = right + 1;

        int i = left + 1;
        while (i < gt) {
            if (arr[i] < arr[left]) {
                swap(arr, ++lt, i++);
            } else if (arr[i] == arr[left]) {
                ++i;
            } else {
                swap(arr, --gt, i);
            }
        }

        swap(arr, left, lt);

        quickSort3ways(arr, left, lt - 1);

        quickSort3ways(arr, lt + 1, right);

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
