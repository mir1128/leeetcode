package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsert35Test {

    @Test
    public void test01() {
        int[] arr = {1, 3, 5, 6};
        assertEquals(1, new SearchInsert35().searchInsert(arr, 2));
    }
}