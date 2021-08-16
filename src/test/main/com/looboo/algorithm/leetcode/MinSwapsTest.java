package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinSwapsTest {
    @Test
    public void test01() {
        assertEquals(1, new MinSwaps().minSwaps("][]["));

        assertEquals(0, new MinSwaps().minSwaps("[]"));
    }

    @Test
    public void test02() {

    }

    @Test
    public void test03() {
        assertEquals(2, new MinSwaps().minSwaps("[[[]]]][][]][[]]][[["));
    }
}