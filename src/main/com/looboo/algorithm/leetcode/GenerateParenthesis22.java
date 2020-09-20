package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        result.add("");

        for (int i = 1; i <= n; ++i) {
            result = next(result);
        }

        return result;
    }

    private List<String> next(List<String> list) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list.size(); ++i) {
            String s = list.get(i);

            int j = 0;
            int left = 0;
            int right = 0;

            result.add("()" + s);
            while (j < s.length()) {
                if (s.charAt(j) == '(') left++;
                if (s.charAt(j) == ')') right++;

                if (left == right) {
                    result.add(addMatch(s, j));
                }
                ++j;
            }
        }
        return result;
    }

    private String addMatch(String s, int j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        stringBuilder.append(s, 0, j + 1);
        stringBuilder.append(")");
        stringBuilder.append(s.substring(j+1));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        List<String> strings = new GenerateParenthesis22().generateParenthesis(3);
        System.out.println(strings);
    }
}
