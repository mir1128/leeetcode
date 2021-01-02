package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinStack155Test {
    @Test
    public void test01() {
        MinStack155 minStack155 = new MinStack155();
        minStack155.push(512);
        minStack155.push(-1024);
        minStack155.push(-1024);
        minStack155.push(512);
        minStack155.pop();
        assertEquals(-1024, minStack155.getMin());
        minStack155.pop();
        assertEquals(-1024, minStack155.getMin());
        minStack155.pop();
        assertEquals(512, minStack155.getMin());
    }
}