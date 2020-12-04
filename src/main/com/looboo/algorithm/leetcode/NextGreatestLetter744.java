package com.looboo.algorithm.leetcode;

public class NextGreatestLetter744 {
    public char nextGreatestLetter(char[] letters, char target) {

        if (target == 'z') return letters[0];

        int left = 0;
        int right = letters.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return (letters[left] == target) ? letters[0] : letters[left];
    }
}
