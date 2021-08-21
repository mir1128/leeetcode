package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

        return Arrays.stream(arr1).boxed().sorted((o1, o2) -> {
            if (map.containsKey(o1) && map.containsKey(o2)) {
                return Integer.compare(map.get(o1), map.get(o2));
            } else if (map.containsKey(o1) && !map.containsKey(o2)) {
                return -1;
            } else if (!map.containsKey(o1) && map.containsKey(o2)) {
                return 1;
            } else {
                return Integer.compare(o1, o2);
            }
        }).mapToInt(i -> i).toArray();
    }
}
