package com.looboo.algorithm.luogu.list02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1059 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());

        int[] nums = new int[n];

        tokenizer = new StringTokenizer(reader.readLine());

        int i = 0;
        while (tokenizer.hasMoreTokens()) nums[i++] = Integer.parseInt(tokenizer.nextToken());

        int v = solve(nums);

        System.out.println(v);
        for (int j = 0; j < v; j++) {
            System.out.print(nums[j] + " ");
        }
    }

    public static int solve(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);

        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                swap(nums, ++k, i);
            }
        }
        return k + 1;
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int[] aux = new int[right - left + 1];

        int i = left;
        int j = mid+1;

        for (int k = 0; k < aux.length; k++) {
            if (i > mid) {
                aux[k] = nums[j++];
            } else if (j > right) {
                aux[k] = nums[i++];
            } else if (nums[i] < nums[j]) {
                aux[k] = nums[i++];
            } else {
                aux[k] = nums[j++];
            }
        }

        System.arraycopy(aux, 0, nums, left, aux.length);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
