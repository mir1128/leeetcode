package com.looboo.algorithm.leetcode.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssertUtils {
    public static <T> boolean equalWithOrder(List<T> l1, List<T> l2) {
        return l1 == l2;
    }

    public static <T> boolean equalWithOutOrder(List<T> l1, List<T> l2) {
        if (l1.size() != l2.size()) return false;
        Set<T> set = new HashSet<>(l2);
        return set.containsAll(l1);
    }

    public static <T> boolean equal2dWithOutOrder(List<List<T>> m1, List<List<T>> m2) {
        if (m1.size() != m2.size()) return false;
        Set<List<T>> set = new HashSet<>(m2);
        return set.containsAll(m1);
    }
}
