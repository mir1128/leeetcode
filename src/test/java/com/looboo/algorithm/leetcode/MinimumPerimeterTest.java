package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumPerimeterTest {

    @Test
    public void test01() {
        assertEquals(8, new MinimumPerimeter().minimumPerimeter(11));
    }

    @Test
    public void test02() {
        assertEquals(233920, new MinimumPerimeter().minimumPerimeter(100000000000000L));
    }
}