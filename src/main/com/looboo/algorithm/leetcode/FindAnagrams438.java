package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams438 {
    public List<Integer> findAnagrams(String s, String p) {

        int left = 0;
        int freq[] = getFreq(p);

        List<Integer> result = new ArrayList<>();
        while (left + p.length() - 1 < s.length()) {
            int[] freq1 = getFreq(s.substring(left, left + p.length()));
            if (isFreqEqual(freq, freq1)) {
                result.add(left);
            }
            left++;
        }
        return result;
    }

    private int[] getFreq(String s) {
        int[] result = new int[26];
        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
        }
        return result;
    }

    private boolean isFreqEqual(int[] left, int[] right) {
        if (left.length != right.length) return false;
        int index = 0;
        while (index < left.length && left[index] == right[index]) {
            ++index;
            continue;
        }
        return index == left.length;
    }

    public static void main(String[] args) {
        String s1 = "abab";
        String p = "ab";

        new FindAnagrams438().findAnagrams(s1, p);
    }
}
