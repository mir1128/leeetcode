package com.looboo.algorithm.luogu.listmath22;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] res = prePermute(nums);
        if (res == null) {
            System.out.println("ERROR");
        } else {
            System.out.println(Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        }
    }

    private static int[] prePermute(int[] nums) {
        if (nums == null || nums.length == 1) return nums;

        int i = nums.length - 2;
        while (i >= 0 && nums[i] <= nums[i + 1]) --i;

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] >= nums[i]) --j;
            swap(nums, i, j);
        } else {
            return null;
        }

        reverse(nums, i + 1, nums.length - 1);

        return nums;
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) swap(nums, i++, j--);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
