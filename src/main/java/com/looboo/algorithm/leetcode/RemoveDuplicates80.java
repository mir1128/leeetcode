package com.looboo.algorithm.leetcode;

public class RemoveDuplicates80 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int currentCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[k]) {
                if (currentCount == 1) {
                    nums[++k] = nums[i];
                    currentCount++;
                } else if (currentCount == 2){
                    continue;
                }
            } else {
                nums[++k] = nums[i];
                currentCount = 1;
            }
        }
        return k+1;
    }
}
