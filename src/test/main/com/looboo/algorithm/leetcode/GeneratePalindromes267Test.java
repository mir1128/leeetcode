package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratePalindromes267Test {
    @Test
    public void test01() {
        assertEquals(Arrays.asList("aaa"), new GeneratePalindromes267().generatePalindromes("aaa"));
    }

    @Test
    public void test02() {
        List<String> expects = Arrays.asList("abcccba", "acbcbca", "bacccab", "bcacacb", "cabcbac", "cbacabc");
        List<String> actual = new GeneratePalindromes267().generatePalindromes("aabbccc");

        assertEquals(expects.size(), actual.size());

        assertEquals(new HashSet<>(expects), new HashSet<>(actual));
    }

    @Test
    public void test03() {
        List<String> expects = Arrays.asList("abcccba", "acbcbca", "bacccab", "bcacacb", "cabcbac", "cbacabc");
        List<String> actual = new GeneratePalindromes267().generatePalindromes("aabbccc");

        assertEquals(expects.size(), actual.size());

        assertEquals(new HashSet<>(expects), new HashSet<>(actual));
    }
}