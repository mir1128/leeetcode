package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindrome5Test {

    @Test
    public void manacher() {
        LongestPalindrome5 longestPalindrome5 = new LongestPalindrome5();
        String babad = "babad";
        assertEquals("bab", longestPalindrome5.manacher(babad));

        assertEquals(3, longestPalindrome5.longestPalindromeLength(babad));
    }
}