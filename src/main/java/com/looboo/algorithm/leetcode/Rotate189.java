package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Rotate189 {
    public void rotate(int[] nums, int k) {

        while (k > nums.length) {
            k -= nums.length;
        }

        if (k == 0) return;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[(nums.length - k + i) % nums.length]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        new Rotate189().rotate(new int[] {1,2,3,4,5,6,7}, 3);
    }
}
