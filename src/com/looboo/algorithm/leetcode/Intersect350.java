package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Intersect350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Long> c1 = Arrays.stream(nums1).mapToObj(i -> i).collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        Map<Integer, Long> c2 = Arrays.stream(nums2).mapToObj(i -> i).collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        Map<Integer, Long> result = c1.entrySet().stream()
                .filter(e -> c2.containsKey(e.getKey()))
                .map(e -> {
                    e.setValue(Math.min(e.getValue(), c2.get(e.getKey())));
                    return e;
                }).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        return result.entrySet().stream().flatMap(e -> repeat(e.getKey(), e.getValue()).stream()).mapToInt(i -> i).toArray();
    }

    private List<Integer> repeat(int i, long n) {
        return LongStream.range(0, n).mapToObj(c -> i).collect(Collectors.toList());
    }
}
