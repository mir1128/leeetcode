package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountConsistentStringsTest {

    @Test
    public void test01() {
        assertEquals(2, new CountConsistentStrings().countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
    }
}