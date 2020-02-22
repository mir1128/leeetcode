package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MinWindow76 {
    public String minWindow(String s, String t) {
        Map<Character, Long> statistic = getStatistic(t);

        int left = 0;
        int right = -1;

        String result = s;
        boolean found = false;

        Map<Character, Long> current = new HashMap<>();

        while (left < s.length()) {
            if (right + 1 < s.length() && !contains(current, statistic)) {
                ++right;
                current.compute(s.charAt(right), (k, v) -> v == null ? 1 : ++v);
            } else {
                current.compute(s.charAt(left), (k, v) -> --v);
                ++left;
            }

            String substring = s.substring(left, right + 1);
            if (contains(current, statistic) && substring.length() <= result.length()) {
                result = substring;
                found = true;
            }
        }

        if (found) return result;

        return "";
    }

    private Map<Character, Long> getStatistic(String s) {
        return s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    private boolean contains(Map<Character, Long> m1, Map<Character, Long> m2) {
        return m2.entrySet().stream().allMatch(e -> m1.containsKey(e.getKey()) && m1.get(e.getKey()) >= e.getValue());
    }

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";

        System.out.println(new MinWindow76().minWindow(s1, s2));
    }
}
