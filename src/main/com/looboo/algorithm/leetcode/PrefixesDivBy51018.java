package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PrefixesDivBy51018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum * 2 + A[i];
            result.add(sum % 5 == 0);
            sum %= 5;
        }

        return result;
    }
}
