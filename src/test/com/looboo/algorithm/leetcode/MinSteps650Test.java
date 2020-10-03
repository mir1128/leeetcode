package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinSteps650Test {
    @Test
    public void test01() {
        assertEquals(3, new MinSteps650().minSteps(3));
    }

    @Test
    public void test02() {
        assertEquals(12, new MinSteps650().minSteps(35));
    }

    @Test
    public void test03() {
        assertEquals(14, new MinSteps650().minSteps(70));
    }

    @Test
    public void test04() {
        assertEquals(21, new MinSteps650().minSteps(1000));
    }
}