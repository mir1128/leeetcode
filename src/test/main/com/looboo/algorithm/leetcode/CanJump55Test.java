package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanJump55Test {
    @Test
    public void test01() {
        int[] ints = Utils.intArray1d("[3,2,1,0,4]");
        assertFalse(new CanJump55().canJump(ints));
    }

    @Test
    public void test02() {
        int[] ints = Utils.intArray1d("[0,1]");
        assertFalse(new CanJump55().canJump(ints));
    }
}