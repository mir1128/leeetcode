package com.looboo.algorithm.leetcode;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindSubstringInWraproundString467 {

//    public int findSubstringInWraproundString(String p) {
//
//        if (p.length() == 0) return 0;
//        int[] count = new int[26];
//
//        int pre = 1;
//        count[p.charAt(0) - 'a'] = 1;
//        for (int i = 1; i < p.length(); i++) {
//            if (p.charAt(i) - p.charAt(i-1) == 1 || (p.charAt(i) == 'a' && p.charAt(i-1) == 'z')) {
//                pre += 1;
//            } else {
//                pre = 1;
//            }
//            count[p.charAt(i) - 'a'] = Math.max(count[p.charAt(i) - 'a'], pre);
//        }
//
//        int sum = 0;
//        for (int i = 0; i < count.length; i++) {
//            sum += count[i];
//        }
//        return sum;
//    }

    public int findSubstringInWraproundString(String p) {
        String s = "^" + p;

        int[] count = new int[26];

        int pre = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) - s.charAt(i-1) == 1 || (s.charAt(i) == 'a' && s.charAt(i-1) == 'z')) {
                pre +=1;
            } else {
                pre = 1;
            }
            count[s.charAt(i) - 'a'] = Math.max(count[s.charAt(i) - 'a'], pre);
        }
        return IntStream.of(count).sum();
    }

    public static void main(String[] args) {
        System.out.println(new FindSubstringInWraproundString467().findSubstringInWraproundString("a"));
    }

}
