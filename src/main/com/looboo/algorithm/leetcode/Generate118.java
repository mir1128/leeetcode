package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generate118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        result.add(Arrays.asList(1));

        for (int i = 1; i < numRows; ++i) {
            List<Integer> last = result.get(i - 1);
            List<Integer> layer = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                layer.add((j - 1 >= 0 ? last.get(j - 1) : 0) + (j < last.size() ? last.get(j) : 0));
            }
            result.add(layer);
        }

        return result;
    }
}
