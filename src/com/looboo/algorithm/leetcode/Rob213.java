package com.looboo.algorithm.leetcode;

public class Rob213 {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int arr[] = new int[nums.length-1];
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            arr[i] = nums[i];
        }
        res = rob1(arr);

        for (int i = 1; i < nums.length; i++) {
            arr[i-1] = nums[i];
        }
        int i1 = rob1(arr);
        if (res < i1) res = i1;

        return res;
    }

    //[start, end)
    private int rob1(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int value[] = new int[n];
        value[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                value[i] = Math.max(value[i], nums[j] + (j + 2 < n ? value[j + 2] : 0));
            }
        }
        return value[0];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        System.out.println(new Rob213().rob(arr));
    }
}
