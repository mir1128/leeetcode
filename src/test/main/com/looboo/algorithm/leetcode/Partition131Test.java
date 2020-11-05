package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.leetcode.utils.AssertUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Partition131Test {
    @Test
    public void test01() {
        List<List<String>> actual = new Partition131().partition("aab");

        List<List<String>> expect = Arrays.asList(Arrays.asList("a", "a", "b"), Arrays.asList("aa", "b"));

        assertTrue(AssertUtils.equal2dWithOutOrder(expect, actual));
    }

    @Test
    public void test02() {
        new Partition131().manacher("aab");
    }
}