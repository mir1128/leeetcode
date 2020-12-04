package com.looboo.algorithm.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AreSentencesSimilar734Test {
    @Test
    public void test01() {
        String[] s1 = {"great", "acting", "skills"};
        String[] s2 = {"fine", "drama", "talent"};
        List<List<String>> pairs = Arrays.asList(
                Arrays.asList("great", "fine"),
                Arrays.asList("drama", "acting"),
                Arrays.asList("skills", "talent"));
        assertTrue(new AreSentencesSimilar734().areSentencesSimilar(s1, s2, pairs));
    }
}