package com.looboo.algorithm.leetcode;

public class MinSwaps {
    public int minSwaps(String s) {
        int diff = 0;

        char[] arr = s.toCharArray();

        int cnt = 0;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (arr[left] == ']') {

                diff--;
                if (diff < 0) {
                    while (arr[right] == ']') right--;

                    arr[left] = '[';
                    arr[right] = ']';
                    cnt++;
                    diff += 2;
                    right--;
                }
                left++;
            } else {
                diff++;
                left++;
            }
        }

        return cnt;
    }
}
