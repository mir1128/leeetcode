package com.looboo.algorithm.leetcode;

import com.looboo.algorithm.leetcode.utils.AssertUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordBreak140Test {
    @Test
    public void test01() {
        String s = "catsanddog";
        List<String> list = new WordBreak140().wordBreak(s, Arrays.asList("cat", "cats", "and", "sand", "dog"));

        List<String> expect = Arrays.asList("cats and dog", "cat sand dog");
        assertTrue(AssertUtils.equalWithOutOrder(expect, list));
    }

    @Test
    public void test02() {
        String s = "pineapplepenapple";
        List<String> list = new WordBreak140().wordBreak(s, Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));

        List<String> expect = Arrays.asList(  "pine apple pen apple",
                "pineapple pen apple",
                "pine applepen apple");
        assertTrue(AssertUtils.equalWithOutOrder(expect, list));
    }

    @Test
    public void test03() {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        List<String> list = new WordBreak140().wordBreak(s, Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));

        List<String> expect = Arrays.asList(  "pine apple pen apple",
                "pineapple pen apple",
                "pine applepen apple");
        assertTrue(AssertUtils.equalWithOutOrder(expect, list));
    }
}