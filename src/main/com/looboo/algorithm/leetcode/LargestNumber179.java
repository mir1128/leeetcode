package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class LargestNumber179 {
    public String largestNumber(int[] nums) {

        String[] strs = new String[nums.length];

        for (int i = 0; i < nums.length; ++i) {

            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (s1, s2)-> -(s1+s2).compareTo(s2+s1));

        StringBuilder stringBuilder = new StringBuilder();

        for(int i  = 0; i < strs.length; ++i) {
            stringBuilder.append(strs[i]);
        }
        String s = stringBuilder.toString();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                return s.substring(i);
            }
        }
        return "0";
    }
}
