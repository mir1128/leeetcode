package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partition131 {
    public List<List<String>> partition(String s) {
        if (s.length() == 0) return new ArrayList<>();
        if (s.length() == 1) return Arrays.asList(Arrays.asList(s));

        List<List<String>> result = new ArrayList<>();
        for (int i = 1; i <= s.length(); i++) {
            String temp = s.substring(0, i);
            if (isPalindrome(temp)) {
                if (i == s.length()) {
                    result.add(Arrays.asList(temp));
                } else {
                    List<List<String>> list = partition(s.substring(i));
                    for (int j = 0; j < list.size(); j++) {
                        List<String> palinds = new ArrayList<>();
                        palinds.add(temp);
                        palinds.addAll(list.get(j));
                        result.add(palinds);
                    }
                }
            }
        }
        return result;
    }

    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "bb";
        System.out.println(new Partition131().partition(s));
    }
}
