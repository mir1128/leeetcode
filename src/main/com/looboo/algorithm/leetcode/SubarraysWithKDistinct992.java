package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDistinct992 {

    public int subarraysWithKDistinct(int[] A, int K) {

        return atMost(A, K) - atMost(A, K-1);
    }

    private int atMost(int[] A, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])) k -= 1;
            map.compute(A[i], (key, value) -> value == null ? 1 : value + 1);

            while (k < 0) {
                map.compute(A[left++], (key, value) -> value - 1);
                if (map.values().removeIf(value -> value.equals(0))) {
                    ++k;
                }
            }
            result += i - left + 1;
        }
        return result;
    }

}
