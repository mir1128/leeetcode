package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindKthNumber440Test {
    @Test
    public void test01() {
        int kthNumber = new FindKthNumber440().findKthNumber(13, 2);

        assertEquals(10, kthNumber);
    }
}