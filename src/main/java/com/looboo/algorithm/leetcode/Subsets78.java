package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {

    public List<List<Integer>> subsets(int[] nums) {
        int length = (int) Math.pow(2, nums.length);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            result.add(getList(nums, i));
        }
        return result;
    }

    private List<Integer> getList(int[] nums, int i) {
        List<Integer> result = new ArrayList<>();
        int n = 0;
        int k = i;
        while (k != 0) {
            if (k % 2 == 1) result.add(nums[n]);
            k /= 2;
            ++n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(new Subsets78().subsets(arr));
    }
}
