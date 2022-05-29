package com.looboo.algorithm.template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Permutation {
    //可重复选择 a^n
    public static List<List<Integer>> permute(int[] nums, int target) {
        Stack<Integer> stack = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, target, 0, stack, result);
        return result;
    }

    private static void permute(int[] nums, int target, int curr, Stack<Integer> stack, List<List<Integer>> result) {
        if (target == curr) {
            result.add(new ArrayList<>(stack));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[i]);
            permute(nums, target, curr + 1, stack, result);
            stack.pop();
        }
    }

    //真正的排列 n!
    public static List<List<Integer>> permuteNoRepeat(int[] nums, int target) {
        Stack<Integer> stack = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        permuteNoRepeat(nums, target, 0, stack, result);
        return result;
    }

    private static void permuteNoRepeat(int[] nums, int target, int curr, Stack<Integer> stack, List<List<Integer>> result) {
        if (target == curr) {
            result.add(new ArrayList<>(stack));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (stack.contains(nums[i])) continue;
            stack.push(nums[i]);
            permuteNoRepeat(nums, target, curr + 1, stack, result);
            stack.pop();
        }
    }

    public static <T> T[] prePermutation(T[] arr, Comparator<T> comparator) {
        if (arr == null || arr.length <= 1) return arr;

        int i = arr.length - 2;
        while (i >= 0 && comparator.compare(arr[i], arr[i + 1]) <= 0) --i;

        if (i >= 0) {
            int j = arr.length - 1;
            while (comparator.compare(arr[j], arr[i]) >= 0) --j;
            swap(arr, i, j);
        }

        reverse(arr, i + 1, arr.length - 1);
        return arr;
    }

    public static <T> T[] nextPermutation(T[] arr, Comparator<T> comparator) {
        if (arr == null || arr.length <= 1) return arr;

        int i = arr.length - 2;
        while (i >= 0 && comparator.compare(arr[i], arr[i + 1]) >= 0) --i;

        if (i >= 0) {
            int j = arr.length - 1;
            while (comparator.compare(arr[j], arr[i]) <= 0) --j;
            swap(arr, i, j);
        }

        reverse(arr, i + 1, arr.length - 1);

        return arr;
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static <T> void reverse(T[] arr, int i, int j) {
        while (i < j) swap(arr, i++, j--);
    }
}
