package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsOffer581 {
    public String reverseWords(String s) {

        String[] s1 = s.split(" ");
        List<String> strings = Arrays.stream(s1).filter(m -> !m.isEmpty()).collect(Collectors.toList());

        Collections.reverse(strings);
        return strings.stream().collect(Collectors.joining(" "));
    }
}
