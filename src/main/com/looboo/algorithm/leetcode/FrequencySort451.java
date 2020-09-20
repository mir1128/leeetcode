package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencySort451 {

    public String frequencySort(String s) {
        Map<Character, Integer> mapping = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mapping.compute(s.charAt(i), (k, v) -> v == null ? 1 : ++v);
        }

        List<Map.Entry<Character, Integer>> collect = mapping.entrySet().stream().sorted((e1, e2) -> e2.getValue() - e1.getValue()).collect(Collectors.toList());

        return collect.stream().flatMap(e -> IntStream.range(0, e.getValue()).mapToObj(i -> String.valueOf(e.getKey()))).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(new FrequencySort451().frequencySort(s));
    }
}
