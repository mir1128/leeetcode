package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDistinct992 {

    public int subarraysWithKDistinct(int[] A, int K) {
        int l = 0;
        Map<Integer, Integer> map = new HashMap<>();

        int pre = 0;
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                if (map.size() == K) {
                    pre++;
                }
                ans += pre;
            } else {
                pre = 0;
                map.put(A[i], 1);
                while (map.size() > K) {
                    map.compute(A[l++], (k, v) -> v - 1);
                    map.values().removeIf(v -> v.equals(0));
                }
            }
        }

        return ans;
    }

    private int atMost(int[] A, int k) {

//        Map<Integer, Integer> map = new HashMap<>();
//
//        int pre = 1;
//        int ans = 0;
//        for (int i = 0; i < A.length; i++) {
//            if (!map.containsKey(A[i])) {
//                k -= 1;
//            }
//            map.compute(A[i], (k, v) -> v == null ? 0 : v + 1);
//
//
//        }
        return 0;
    }


}
