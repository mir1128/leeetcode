package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis0809 {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        help(n, n, "", result);
        return result;
    }

    private void help(int l, int r, String s, List<String> result) {
        if (l == 0 && r == 0) {
            result.add(s);
            return;
        }

        if (l != 0) help(l-1, r, s + "(", result);
        if (l < r) help(l, r-1, s + ")", result);
    }
}
