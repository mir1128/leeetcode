package com.looboo.algorithm.luogu.list02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class P1152 {
    private static Random random = new Random();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diff[i] = Math.abs(arr[i+1] - arr[i]);
        }

        quickSort2(diff, 0, diff.length - 1);

        for (int i = 0; i < diff.length - 1; i++) {
            if (diff[i] != i + 1) {
                System.out.println("Not jolly");
                return;
            }
        }
        System.out.println("Jolly");
    }

    public static void quickSort2(int[] diff, int left, int right) {
        if (left >= right) return;
        int rnd = random.nextInt(right - left + 1) + left;

        swap(diff, rnd, left);

        int i = left + 1;
        int j = right;

        while (true) {
            while (i <= right && diff[i] < diff[left]) i++;
            while (j >= left + 1 && diff[j] > diff[left]) j--;
            if (i > j) break;
            swap(diff, i, j);
            i++;
            j--;
        }

        swap(diff, left, j);

        quickSort2(diff, left, j - 1);
        quickSort2(diff, j + 1, right);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
