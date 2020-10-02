package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumJewelsInStones771Test {

    @Test
    public void test01() {
        String J = "aA";
        String S = "aAAbbbb";

        assertEquals(3, new NumJewelsInStones771().numJewelsInStones(J, S));
    }

    @Test
    public void test02() {
        String J = "z", S = "ZZ";
        assertEquals(0, new NumJewelsInStones771().numJewelsInStones(J, S));
    }
}