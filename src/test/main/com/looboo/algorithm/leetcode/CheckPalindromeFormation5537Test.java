package com.looboo.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeFormation5537Test {
    @Test
    public void test01() {
        assertEquals(true, new CheckPalindromeFormation5537().checkPalindromeFormation("x", "y"));
    }

    @Test
    public void test02() {
        assertEquals(true, new CheckPalindromeFormation5537().checkPalindromeFormation("abdef", "fecab"));
    }

    @Test
    public void test03() {
        assertEquals(true, new CheckPalindromeFormation5537().checkPalindromeFormation("ulacfd", "jizalu"));
    }

    @Test
    public void test04() {
        assertEquals(true, new CheckPalindromeFormation5537().checkPalindromeFormation("cdeoo", "oooab"));
    }

    @Test
    public void test05() {
        assertEquals(true, new CheckPalindromeFormation5537().checkPalindromeFormation("pvhmupgqeltozftlmfjjde", "yjgpzbezspnnpszebzmhvp"));
    }

    @Test
    public void test06() {
        assertEquals(false, new CheckPalindromeFormation5537().checkPalindromeFormation("xbdef", "xecab"));
    }

    @Test
    public void test07() {
        assertEquals(true, new CheckPalindromeFormation5537().checkPalindromeFormation(
                "aejbaalflrmkswrydwdkdwdyrwskmrlfqizjezd",
                "uvebspqckawkhbrtlqwblfwzfptanhiglaabjea"));
    }




}
