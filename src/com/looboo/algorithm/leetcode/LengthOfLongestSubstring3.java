package com.looboo.algorithm.leetcode;

public class LengthOfLongestSubstring3 {
    public int lengthOfLongestSubstring(String s) {
        int freq[] = new int[256];

        int left = 0;
        int right = -1;

        int result = 0;
        while (left < s.length()) {
            if (right + 1 < s.length() && freq[s.charAt(right + 1)] == 0) {
                freq[s.charAt(++right)] = 1;
            } else {
                freq[s.charAt(left++)] = 0;
            }

            if (right - left + 1 > result) result = right - left + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        new LengthOfLongestSubstring3().lengthOfLongestSubstring(s);
    }
}
