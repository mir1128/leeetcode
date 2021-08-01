package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsStrobogrammatic246Test {
    @Test
    public void test01() {
        assertFalse(new IsStrobogrammatic246().isStrobogrammatic("2"));
        assertTrue(new IsStrobogrammatic246().isStrobogrammatic("101"));
    }
}