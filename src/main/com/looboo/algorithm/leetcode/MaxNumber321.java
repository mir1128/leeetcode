package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxNumber321 {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {

        List<Integer> max = new ArrayList<>();
        for (int i = Math.max(k - nums2.length, 0); i <= Math.min(nums1.length, k); i++) {

            List<Integer> result1 = max(nums1, nums1.length - i);
            List<Integer> result2 = max(nums2, nums2.length - (k - i));

            System.out.println(result1);
            System.out.println(result2);
            List<Integer> merged = merge(result1, result2);
            System.out.println(merged);

            if (compare(merged, max) == 1) {
                max = merged;
            }
        }

        return max.stream().mapToInt(i -> i).toArray();
    }

    private int compare(List<Integer> left, List<Integer> right) {

        int i = 0;
        while (i < left.size() && i < right.size()) {
            if (left.get(i) > right.get(i)) return 1;
            if (left.get(i) < right.get(i)) return -1;
            ++i;
        }

        if (i == left.size() && i != right.size()) return -1;
        if (i == right.size() && i != left.size()) return 1;
        return 0;
    }

    private List<Integer> merge(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();

        while (!l1.isEmpty() || !l2.isEmpty()) {
            if (greatThan(l1, l2)) {
                result.add(l1.get(0));
                l1 = l1.subList(1, l1.size());
            } else {
                result.add(l2.get(0));
                l2 = l2.subList(1, l2.size());
            }
        }

        return result;
    }

    private boolean greatThan(List<Integer> l1, List<Integer> l2) {
        int i = 0;
        for (; i < l1.size() && i < l2.size(); i++) {
            if (l1.get(i) > l2.get(i)) return true;
            if (l1.get(i) < l2.get(i)) return false;
        }
        if (i == l1.size()) return false;

        return true;
    }

    private List<Integer> max(int num[], int k) {
        Stack<Integer> stack = new Stack<>();

        int m = k;

        for (int i = 0; i < num.length; i++) {
            while (m > 0 && !stack.isEmpty() && stack.peek() < num[i]) {
                stack.pop();
                --m;
            }
            stack.push(num[i]);
        }
        List<Integer> result = new ArrayList<>(stack);
        return result.subList(0, num.length - k);
    }

    public static void main(String[] args) {
        
    }
}
