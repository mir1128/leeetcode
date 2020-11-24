package com.looboo.algorithm.leetcode;

import java.util.Arrays;

public class IsStraight61 {
    public boolean isStraight(int[] nums) {

        Arrays.sort(nums);

        int i = 0;
        for (; i < 5; ++i) {
            if (nums[i] != 0) break;
        }
        int sum = 0;
        for (int j = i + 1; j < 5; j++) {
            int m = nums[j] - nums[j-1] - 1;
            if (m < 0 ) return false;
            sum += m;
        }

        return i == sum;
    }
}
