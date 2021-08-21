package com.looboo.algorithm.leetcode;

public class ReversePairsOffer51 {

    private int result = 0;

    public int reversePairs(int[] nums) {
        result = 0;
        mergeSort(nums, 0, nums.length - 1);
        return result;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] arr = new int[right - left + 1];

        int i = left;
        int j = mid + 1;

        for (int k = 0; k < arr.length; k++) {
            if (i > mid) {
                arr[k] = nums[j++];
            } else if (j > right) {
                arr[k] = nums[i++];
            } else if (nums[i] < nums[j]) {
                arr[k] = nums[i++];
            } else if (nums[i] > nums[j]) {
                result += (mid - i + 1);
                arr[k] = nums[j++];
            } else {
                arr[k] = nums[i++];
            }
        }

        System.arraycopy(arr, 0, nums, left, arr.length);
    }


    public int reversePairs1(int[] nums) {
        if (nums.length == 0) return 0;
        return merge(nums, 0, nums.length - 1);
    }

    private int merge(int[] nums, int start, int end) {
        if (start == end) return 0;

        int mid = start + (end - start) / 2;
        int count = merge(nums, start, mid) + merge(nums, mid + 1, end);

        int[] arr = new int[end - start + 1];
        int p1 = start;
        int p2 = mid + 1;
        int p = 0;
        while (p1 <= mid && p2 <= end) {
            if (nums[p2] < nums[p1]) {
                arr[p++] = nums[p2++];
                count += mid - p1 + 1;
            } else {
                arr[p++] = nums[p1++];
            }
        }

        while (p1 <= mid) arr[p++] = nums[p1++];
        while (p2 <= end) arr[p++] = nums[p2++];

        System.arraycopy(arr, 0, nums, start, end - start + 1);
        return count;
    }
}
