package com.looboo.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class PhoneDirectory379 {
    private Set<Integer> set;

    public PhoneDirectory379(int maxNumbers) {
        set = new HashSet<>();
        IntStream.range(0, maxNumbers).forEach(i -> set.add(i));
    }

    /**
     * Provide a number which is not assigned to anyone.
     *
     * @return - Return an available number. Return -1 if none is available.
     */
    public int get() {
        if (set.size() == 0) return -1;

        Integer a = set.iterator().next();
        set.remove(a);
        return a;
    }

    /**
     * Check if a number is available or not.
     */
    public boolean check(int number) {
        return set.contains(number);
    }

    /**
     * Recycle or release a number.
     */
    public void release(int number) {
        set.add(number);
    }
}
