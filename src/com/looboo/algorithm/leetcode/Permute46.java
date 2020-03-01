package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Permute46 {

    private boolean[] used;
    private List<List<Integer>> result;


    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        result = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        permute(nums, stack);
        return result;
    }

    private void permute(int[] nums, Stack<Integer> current) {
        if (nums.length == current.size()) {
            ArrayList<Integer> onePermute = new ArrayList<>();
            onePermute.addAll(current);
            result.add(onePermute);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                current.push(nums[i]);
                used[i] = true;
                permute(nums, current);
                used[i] = false;
                current.pop();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(new Permute46().permute(new int[] {1,2,3}));
    }
}
