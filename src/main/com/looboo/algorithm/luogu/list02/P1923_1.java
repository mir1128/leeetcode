package com.looboo.algorithm.luogu.list02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1923_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int result = findKthMin(nums, k);
        System.out.println(result);
    }

    public static int findKthMin(int[] nums, int k) {
        return quickSort(nums, 0, nums.length - 1, k);
    }

    public static int quickSort(int[] nums, int left, int right, int k) {
        if (left >= right) return nums[k];

        int i = left + 1;
        int j = right;

        while (true) {
            while (i <= right && nums[i] < nums[left]) ++i;
            while (j >= left + 1 && nums[j] > nums[left]) --j;
            if (i > j) break;
            swap(nums, i, j);
            i++;
            j--;
        }

        swap(nums, j, left);

        if (j == k) return nums[j];
        else if (k < j) return quickSort(nums, left, j - 1, k);
        return quickSort(nums, j + 1, right, k);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
