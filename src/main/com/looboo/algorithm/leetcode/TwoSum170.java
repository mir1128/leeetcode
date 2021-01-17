package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum170 {

    private Map<Integer, Integer> map;

    public TwoSum170() {
        map = new HashMap<>();
    }

    /**
     * Add the number to an internal data structure..
     */
    public void add(int number) {
        map.compute(number, (k, v) -> v == null ? 1 : v + 1);
    }

    /**
     * Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        for (Integer key : map.keySet()) {
            int a = value - key;
            if ((a == key && map.get(key) >= 2) || (a != key) && map.containsKey(a)){
                return true;
            }
        }
        return false;
    }
}
