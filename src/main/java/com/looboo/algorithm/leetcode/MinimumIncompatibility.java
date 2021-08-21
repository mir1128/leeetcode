package com.looboo.algorithm.leetcode;

import java.util.Collections;

public class MinimumIncompatibility {
    public int minimumIncompatibility(int[] nums, int n) {

        int[] bucket = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            ++bucket[nums[i]];
            if (bucket[nums[i]] > n) {
                return -1;
            }
        }

        int m = 0;
        int res = 0;
        while (m < n) {

            int cnt = 0;
            int min = nums.length;
            int max = -1;
            for (int i = 0; i < bucket.length; i++) {
                if (bucket[i] > 0 && cnt < nums.length / n) {
                    min = Math.min(i, min);
                    max = Math.max(i, max);
                    cnt++;
                    --bucket[i];
                }
                if (cnt == nums.length / n) {
                    break;
                }
            }
            System.out.println(String.format("min = %s, max = %s", min, max));
            m++;
            res += (max - min);
        }



        return res;
    }
}
