package com.looboo.algorithm.leetcode;

public class SortColors75 {
    public void sortColors(int[] nums) {
        int zero = -1;  //[0, zero]  [zero+1, index)  [index, two)
        int two = nums.length;  //[two, nums.length-1]

        int i = 0;
        while (i < two) {
            if (nums[i] == 0) {
                swap(nums, ++zero, i++);
            } else if (nums[i] == 1) {
                ++i;
            } else {
                --two;
                swap(nums, i, two);
            }
        }
        int a = 0;
    }

    private void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,1};

        SortColors75 sortColors75 = new SortColors75();
        sortColors75.sortColors(arr);
    }
}
