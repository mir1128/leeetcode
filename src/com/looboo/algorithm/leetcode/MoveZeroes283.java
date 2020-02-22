package com.looboo.algorithm.leetcode;

import java.util.stream.IntStream;

public class MoveZeroes283 {

    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                if (i != k) {
                    int tmp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = tmp;
                    k++;
                } else {
                    k++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        MoveZeroes283 moveZeroes283 = new MoveZeroes283();
        moveZeroes283.moveZeroes(arr);

        IntStream.of(arr).forEach(s -> System.out.println(s));
    }
}
