package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumDifferentIntegersTest {

    @Test
    public void test01() {
        assertEquals(2, new NumDifferentIntegers().numDifferentIntegers("leet1234code234"));
        assertEquals(1, new NumDifferentIntegers().numDifferentIntegers("167278959591294"));
    }


}