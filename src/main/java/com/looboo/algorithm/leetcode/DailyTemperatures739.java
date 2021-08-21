package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class DailyTemperatures739 {
    public int[] dailyTemperatures(int[] T) {

        int[] res = new int[T.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                Integer pop = stack.pop();
                res[pop] = i - pop;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            res[stack.pop()] = 0;
        }

        return res;
    }
}
