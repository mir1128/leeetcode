package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FourSum18Test {
    @Test
    public void test01() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(new FourSum18().fourSum(nums, 0));
    }
}