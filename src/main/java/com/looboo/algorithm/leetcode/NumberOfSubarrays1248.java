package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSubarrays1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        List<Integer> odd = new ArrayList<>();
        odd.add(-1);

        int ans = 0;
        int i = 1;
        for (int j = 0; j <= nums.length; j++) {
            if (j == nums.length || (nums[j] & 1) != 0) {
                odd.add(j);
            }

            if (odd.size() - i > k) {
                int left = odd.get(i) - odd.get(i - 1);
                int right = j - odd.get(odd.size() - 2);
                ans += left * right;
                i++;
            }
        }
        return ans;
    }
}

