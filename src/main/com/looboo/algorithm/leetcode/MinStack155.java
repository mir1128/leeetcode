package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class MinStack155 {

    private Stack<Integer> stack;
    private Stack<Integer> min;

    public MinStack155() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        }
    }

    public void pop() {
        Integer pop = stack.pop();
        if (pop.equals(min.peek())) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
