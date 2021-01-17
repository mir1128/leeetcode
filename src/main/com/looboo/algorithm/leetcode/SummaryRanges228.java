package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);


        StringBuilder stringBuilder = new StringBuilder();
        Integer start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                if (start == nums[i - 1]) {
                    stringBuilder.append(start);
                } else {
                    stringBuilder.append(start).append("->").append(nums[i - 1]);
                }
                res.add(stringBuilder.toString());
                start = nums[i];
                stringBuilder = new StringBuilder();
            }
        }
        if (start == nums[nums.length - 1]) {
            stringBuilder.append(start);
        } else {
            stringBuilder.append(start).append("->").append(nums[nums.length - 1]);
        }
        res.add(stringBuilder.toString());
        return res;
    }
}
