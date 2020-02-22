package com.looboo.algorithm.leetcode;

import java.util.Random;

public class FindKthLargest215 {

    private Random random = new Random();

    public int findKthLargest(int[] nums, int k) {

        return findKthLargest(nums, 0, nums.length - 1, k);
    }

    public int findKthLargest(int[] nums, int l, int r, int k) {

        int index = partition(nums, l, r);
        if (index + 1 == k) return nums[index];
        if (index + 1 > k) return findKthLargest(nums, l, index - 1, k);
        if (index + 1 < k) return findKthLargest(nums, index + 1, r, k);

        return -1;
    }

    private int partition(int[] nums, int l, int r) {
        int e = random.nextInt(r - l) + l;

        int v = nums[e];

        int j = l;
        int i = l + 1;

        swap(nums, j, e);

        while (i <= r) {
            if (nums[i] >= v) {
                swap(nums, ++j, i);
            }
            ++i;
        }

        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i1, int i2) {
        int tmp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;

        FindKthLargest215 findKthLargest215 = new FindKthLargest215();
        int kthLargest = findKthLargest215.findKthLargest(arr, 4);
        System.out.println("-----------------" + kthLargest);
    }
}
