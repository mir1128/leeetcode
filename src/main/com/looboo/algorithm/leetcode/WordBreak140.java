package com.looboo.algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class WordBreak140 {
//    public List<String> wordBreak(String s, List<String> wordDict) {
//        Set<String> words = new HashSet<>(wordDict);
//
//        int n = s.length();
//        boolean[][] prev = new boolean[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                String sub = s.substring(i, j + 1);
//                if (words.contains(sub)) {
//                    prev[i][j] = true;
//                }
//            }
//        }
//
//        List<String> result = new ArrayList<>();
//
//        Stack<String> stack = new Stack<>();
//        dfs(prev, s, 0, stack, result);
//        return result;
//    }
//
//    private void dfs(boolean[][] prev, String s, int start, Stack<String> stack, List<String> result) {
//        int n = s.length();
//
//        for (int i = start; i < n; i++) {
//            if (prev[start][i]) {
//                if (i == n - 1) {
//                    List<String> list = new ArrayList<>(stack);
//                    list.add(s.substring(start, i + 1));
//                    result.add(list.stream().collect(Collectors.joining(" ")));
//                } else {
//                    stack.push(s.substring(start, i + 1));
//                    dfs(prev, s, i + 1, stack, result);
//                    stack.pop();
//                }
//            }
//
//        }
//    }

    public List<String> wordBreak(String s, List<String> wordDict) {

        int n = s.length();

        boolean[] dp = new boolean[n];

        Set<String> wordSet = new HashSet<>(wordDict);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (wordSet.contains(s.substring(j, i + 1)) && (j == 0 || dp[j - 1])) {
                    dp[i] = true;
                    break;
                }
            }
        }

        List<String> result = new ArrayList<>();

        if (dp[n - 1]) {
            Deque<String> deque = new LinkedList<>();
            dfs(s, dp, n, deque, wordSet, result);
        }

        return result;
    }

    private void dfs(String s, boolean[] dp, int len, Deque<String> deque, Set<String> wordSet, List<String> result) {
        if (len == 0) {
            result.add(String.join(" ", deque));
            return;
        }

        // 可以拆分的左边界从 len - 1 依次枚举到 0
        for (int i = len - 1; i >= 0; i--) {
            String suffix = s.substring(i, len);
            if (wordSet.contains(suffix) && (i == 0 || dp[i - 1])) {
                deque.addFirst(suffix);
                dfs(s, dp, i, deque, wordSet, result);
                deque.removeFirst();
            }
        }
    }
}
