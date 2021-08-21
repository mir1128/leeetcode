package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords151 {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        List<String> collect = Arrays.stream(s1).filter(str -> str.length() != 0).collect(Collectors.toList());
        Collections.reverse(collect);
        return String.join(" ", collect);
    }
}
