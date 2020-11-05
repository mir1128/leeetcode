package com.looboo.algorithm.leetcode;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Partition131 {
//
//    public List<List<String>> partition(String s) {
//        if (s.length() == 0) return new ArrayList<>();
//        if (s.length() == 1) return Arrays.asList(Arrays.asList(s));
//
//        List<List<String>> result = new ArrayList<>();
//        for (int i = 1; i <= s.length(); i++) {
//            String temp = s.substring(0, i);
//            if (isPalindrome(temp)) {
//                if (i == s.length()) {
//                    result.add(Arrays.asList(temp));
//                } else {
//                    List<List<String>> list = partition(s.substring(i));
//                    for (int j = 0; j < list.size(); j++) {
//                        List<String> palinds = new ArrayList<>();
//                        palinds.add(temp);
//                        palinds.addAll(list.get(j));
//                        result.add(palinds);
//                    }
//                }
//            }
//        }
//        return result;
//    }
//
//    public boolean isPalindrome(String s) {
//        for (int i = 0; i < s.length() / 2; i++) {
//            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String s = "bb";
//        System.out.println(new Partition131().partition(s));
//    }

    public List<List<String>> partition(String s) {

        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        for (int col = 0; col < n; col++) {
            for (int row = 0; row <= col; row++) {
                if (row == col) {
                    dp[row][col] = true;
                } else {
                    if (s.charAt(row) == s.charAt(col)) {
                        if (col - row < 3) {
                            dp[row][col] = true;
                        } else {
                            dp[row][col] = dp[row + 1][col - 1];
                        }
                    }
                }
            }
        }

        Utils.print(dp);

        List<List<String>> result = new ArrayList<>();

        Stack<String> stack = new Stack<>();
        dfs(dp, 0, s, stack, result);

        return result;
    }

    private void dfs(boolean[][] dp, int start, String s, Stack<String> prefix, List<List<String>> result) {
        int n = dp.length;

        for (int i = start; i < n; i++) {
            if (dp[start][i]) {
                if (i == n - 1) {
                    List<String> list = new ArrayList<>(prefix);
                    list.add(s.substring(start));
                    result.add(list);
                } else {
                    prefix.push(s.substring(start, i + 1));
                    dfs(dp, i + 1, s, prefix, result);
                    prefix.pop();
                }
            }
        }
    }

    public List<List<String>> manacher(String s) {
        List<List<String>> result = new ArrayList<>();

        String processed = IntStream
                .range(0, s.length())
                .mapToObj(i -> String.valueOf(s.charAt(i)))
                .collect(Collectors.joining("#", "#", "#"));

        int length = processed.length();
        int[] p = new int[length];

        int center = -1;
        int max = -1;
        int pi = -1;
        int pm = -1;
        for (int i = 0; i < length; i++) {
            if (max <= i) {
                int len = len(processed, i);
                p[i] = len;
                max = i + len - 1;
                center = i;
            } else {
                pi = 2 * center - i;
                pm = 2 * center - max;
                if (p[pi] > pi - pm + 1) {
                    p[i] = pi - pm + 1;
                } else if (p[pi] < pi - pm + 1) {
                    p[i] = p[pi];
                } else {
                    int len = len(processed, i);
                    max = len + i - 1;
                    center = i;
                    p[i] = len;
                }
            }
        }

        Utils.print(p);

        return result;
    }

    private int len(String s, int index) {
        int n = 0;
        while (index - n >= 0 && index + n < s.length() && s.charAt(index - n) == s.charAt(index + n)) {
            ++n;
        }
        return n;
    }
}
