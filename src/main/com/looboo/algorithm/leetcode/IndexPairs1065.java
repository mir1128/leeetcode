package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexPairs1065 {
    public int[][] indexPairs(String text, String[] words) {

        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {

            int index = 0;
            while (index != -1) {
                index = text.indexOf(words[i], index);
                if (index != -1) {
                    res.add(new int[]{index, index + words[i].length() - 1});
                    index += 1;
                }
            }
        }

        int[][] ans =  res.toArray(new int[res.size()][2]);
        Arrays.sort(ans, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        return ans;
    }
}
