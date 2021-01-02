package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class CountSegments434 {
    public int countSegments(String s) {
        return (int) Arrays.stream(s.split(" ")).filter(m -> !m.isEmpty()).count();
    }
}
