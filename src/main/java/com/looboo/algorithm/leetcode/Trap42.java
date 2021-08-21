package com.looboo.algorithm.leetcode;

import java.nio.file.StandardOpenOption;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.DelayQueue;

public class Trap42 {
    public int trap(int[] height) {
        int res = 0;

        for (int i = 0; i < height.length; i++) {
            int left = 0;
            int right = 0;

            for (int j = i; j >= 0; j--) {
                left = Math.max(left, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                right = Math.max(right, height[j]);
            }

            res += Math.min(left, right) - height[i];
        }
        return res;
    }

    public int trap1(int[] height) {
        if (height == null || height.length == 0) return 0;


        int size = height.length;
        int[] left_max = new int[size];
        int[] right_max = new int[size];

        left_max[0] = height[0];
        for (int i = 1; i < height.length; ++i) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }

        right_max[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }

        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            ans += Math.min(left_max[i], right_max[i]) - height[i];
        }

        return ans;
    }

    public int trap2(int[] height) {
        int res = 0;
        int current = 0;
        Stack<Integer> stack = new Stack<>();
        while (current < height.length) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                Integer pop = stack.pop();
                if (stack.isEmpty()) break;

                int length = current - stack.peek() - 1;
                int h = Math.min(height[stack.peek()], height[current]) - height[pop];

                res += length * h;
            }
            stack.push(current++);
        }
        return res;
    }
}
