package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class MaxNumber321 {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        Stack<Integer> stack = new Stack<>();

        int index1 = 0;
        int index2 = 0;

        while (index1 < nums1.length && index2 < nums2.length) {
            int val = Math.max(nums1[index1], nums2[index2]);
            while (remain(stack.size(), nums1.length, nums2.length, index1, index2) > k && !stack.isEmpty() && stack.peek() < val) {
                stack.pop();
            }

            if (remain(stack.size(), nums1.length, nums2.length, index1, index2) == k) {
                pushRemainToStack(stack, nums1, nums2, index1, index2);
                return stack.stream().mapToInt(i -> i).toArray();
            } else {
                stack.push(val);
                if (val == nums1[index1]) {
                    index1++;
                } else {
                    index2++;
                }
            }
        }

        if (index1 == nums1.length) {
            pushRemainToStack(stack, nums2, index2, k);
        } else if (index2 == nums2.length) {
            pushRemainToStack(stack, nums1, index1, k);
        } else {
            //error
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }

    private void pushRemainToStack(Stack<Integer> stack, int[] nums, int index, int k) {
        while (stack.size() < k) {
            stack.push(nums[index]);
            ++index;
        }
    }

    private void pushRemainToStack(Stack<Integer> stack, int[] nums1, int[] nums2, int index1, int index2) {
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] >= nums2[index2]) {
                stack.push(nums1[index1]);
                index1++;
            } else {
                stack.push(nums2[index2]);
                index2++;
            }
        }
    }

    private int remain(int stack, int num1, int num2, int index1, int index2) {
        return stack + num1 - index1 + num2 - index2;
    }
}
