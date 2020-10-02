package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumOperationsLcp19Test {
    @Test
    public void test01() {
        assertEquals(2, new MinimumOperationsLcp19().minimumOperations("rrryyyrryyyrr"));
    }

    @Test
    public void test02() {
        assertEquals(0, new MinimumOperationsLcp19().minimumOperations("ryr"));
    }
}