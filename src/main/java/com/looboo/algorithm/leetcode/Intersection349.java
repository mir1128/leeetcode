package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Intersection349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> c1 = Arrays.stream(nums1).mapToObj(c -> c).collect(Collectors.toSet());
        Set<Integer> c2 = Arrays.stream(nums2).mapToObj(c -> c).collect(Collectors.toSet());

        c1.retainAll(c2);

        return c1.stream().mapToInt(c -> c).toArray();
    }
}
