package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CddRungsTest {
    @Test
    public void name() {
        int[] run = new int[] {1,3,5,10};
        int i = new CddRungs().addRungs(run, 2);

        assertEquals(i, 2);

        int[] run1 = new int[] {3,4,6,7};
        int i1 = new CddRungs().addRungs(run1, 2);

        assertEquals(i1, 1);

        int[] run2 = new int[]{3};
        int i2 = new CddRungs().addRungs(run2, 1);

        assertEquals(i2, 2);
        int a = 0;
    }
}