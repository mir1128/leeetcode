package com.looboo.algorithm.package9.pack03;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplePackTest {
    @Test
    public void test01() {
        int[] v = {1, 2, 3, 4};
        int[] w = {2, 4, 4, 5};
        int[] s = {3, 1, 3, 2};

        assertEquals(10, new MultiplePack().multiplePack(v, w, s, 5));
    }
}