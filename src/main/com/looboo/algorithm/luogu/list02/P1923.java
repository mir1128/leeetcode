package com.looboo.algorithm.luogu.list02;

import java.util.Random;
import java.util.Scanner;

//三路快排超出是时间范围
public class P1923 {

    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = findKthMin(nums, k);
        System.out.println(result);
    }

    public static int findKthMin(int[] nums, int k) {

        return findKthMin(nums, 0, nums.length - 1, k);
    }

    private static int findKthMin(int[] nums, int left, int right, int k) {
        if (left > right) {
            throw new RuntimeException();
        }
        if (left == right) {
            if (k != left) {
                throw new RuntimeException();
            }
            return nums[left];
        }

        int rnd = random.nextInt(right - left + 1) + left;

        swap(nums, rnd, left);
        int lt = left;
        int gt = right + 1;

        int i = lt;
        while (i < gt) {
            if (nums[i] == nums[left]) {
                i++;
            } else if (nums[i] < nums[left]) {
                swap(nums, ++lt, i++);
            } else {
                swap(nums, --gt, i);
            }
        }
        swap(nums, left, lt);

        if (k < lt) {
            return findKthMin(nums, left, lt, k);
        } else if (k == lt) {
            return nums[lt];
        } else if (k > lt && k < gt) {
            return nums[lt + 1];
        } else if (k == gt) {
            return nums[gt];
        } else {
            return findKthMin(nums, gt, right, k);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
