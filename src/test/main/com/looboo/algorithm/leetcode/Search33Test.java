package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Search33Test {

    @Test
    public void test01() {
        int [] arr = {4,5,6,7,0,1,2};
        assertEquals(4, new Search33().search(arr, 0));
    }
}