package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ReorganizeString767 {

    public String reorganizeString1(String s) {
        int[][] counts = new int[26][2];

        for (int i = 0; i < s.length(); i++) {
            int[] count = counts[s.charAt(i) - 'a'];
            count[0] = s.charAt(i) - 'a';
            count[1] += 1;
        }

        Arrays.sort(counts, Comparator.comparingInt(arr -> arr[1]));
        return "";
    }

    public String reorganizeString(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        for (Character c : map.keySet()) {

            map.computeIfPresent(c, (k, v) -> v = v - 1);
            String reorganize = reorganize(map, c, s.length() - 1);
            map.computeIfPresent(c, (k, v) -> v = v + 1);

            if (!reorganize.isEmpty()) {
                return "" + c + reorganize;
            }
        }
        return "";
    }

    private String reorganize(Map<Character, Integer> map, Character c, int length) {
        if (length == 0) return "";

        for (Character key : map.keySet()) {
            if (key.equals(c) || map.get(key).equals(0)) continue;

            map.computeIfPresent(key, (k, v) -> v = v - 1);
            String res = reorganize(map, key, length - 1);
            map.computeIfPresent(key, (k, v) -> v = v + 1);
            if (res.length() == length - 1) {
                return "" + key + res;
            }
        }

        return "";
    }
}
