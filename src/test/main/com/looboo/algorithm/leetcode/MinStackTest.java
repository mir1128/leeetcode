package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {

    @Test
    public void test01() {
        MinStack minStack = new MinStack();

        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);

        int top = minStack.top();

        minStack.pop();

        int min = minStack.min();

        minStack.pop();

        int min1 = minStack.min();

        minStack.pop();
        minStack.push(2147483647);
        int top1 = minStack.top();
        int min2 = minStack.min();
        minStack.push(-2147483648);
        int top2 = minStack.top();
        int min3 = minStack.min();
        minStack.pop();
        int min4 = minStack.min();
    }
}