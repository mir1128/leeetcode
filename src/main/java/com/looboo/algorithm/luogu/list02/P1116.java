package com.looboo.algorithm.luogu.list02;

import java.util.Scanner;

public class P1116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] cabin = new int[n];
        for (int i = 0; i < n; i++) {
            cabin[i] = scanner.nextInt();
        }

        int v = mergeSort(cabin, 0, n - 1);
        System.out.println(v);
    }

    private static int mergeSort(int[] cabin, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        return mergeSort(cabin, left, mid)
                + mergeSort(cabin, mid + 1, right)
                + merge(cabin, left, mid, right);
    }

    private static int merge(int[] cabin, int left, int mid, int right) {
        int[] aux = new int[right - left + 1];

        int i = left;
        int j = mid + 1;

        int result = 0;
        for (int k = 0; k < aux.length; k++) {
            if (i > mid) {
                aux[k] = cabin[j++];
            } else if (j > right) {
                aux[k] = cabin[i++];
            } else if (cabin[i] > cabin[j]) {
                aux[k] = cabin[j++];
                result += mid - i + 1;
            } else {
                aux[k] = cabin[i++];
            }
        }

        System.arraycopy(aux, 0, cabin, left, aux.length);
        return result;
    }
}
