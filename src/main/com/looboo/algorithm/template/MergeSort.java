package com.looboo.algorithm.template;

public class MergeSort {
    public static void mergeSort(int[] arr) {

        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;

        int[] aux = new int[right - left + 1];

        for (int k = 0; k < aux.length; k++) {
            if (i > mid) {
                aux[k] = arr[j++];
            } else if (j > right) {
                aux[k] = arr[i++];
            } else if (arr[i] < arr[j]) {
                aux[k] = arr[i++];
            } else {
                aux[k] = arr[j++];
            }
        }

        System.arraycopy(aux, 0, arr, left, aux.length);
    }
}
