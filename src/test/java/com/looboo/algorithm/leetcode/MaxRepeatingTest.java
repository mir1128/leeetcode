package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxRepeatingTest {
    @Test
    public void test01() {
        assertEquals(2, new MaxRepeating().maxRepeating("ababc", "ab"));
    }
}