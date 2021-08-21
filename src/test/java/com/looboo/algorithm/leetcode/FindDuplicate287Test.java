package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindDuplicate287Test {
    @Test
    public void test01() {
        int[] nums = {1, 3, 4, 2, 2};
        assertEquals(2, new FindDuplicate287().findDuplicate(nums));
    }
}