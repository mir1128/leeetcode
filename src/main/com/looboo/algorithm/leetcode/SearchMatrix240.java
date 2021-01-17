package com.looboo.algorithm.leetcode;

public class SearchMatrix240 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int top = 0;
        int bottom = matrix.length - 1;

        while (top < bottom) {
            int mid = top + (bottom - top + 1) / 2;
            if (matrix[mid][0] > target) {
                bottom = mid - 1;
            } else {
                top = mid;
            }
        }
        int end = top;

        top = 0;
        bottom = matrix.length - 1;

        int width = matrix[0].length;
        while (top < bottom) {
            int mid = top + (bottom - top) / 2;
            if (matrix[mid][width - 1] < target) {
                top = mid + 1;
            } else {
                bottom = mid;
            }
        }
        int start = top;

        for (int i = start; i <= end; i++) {
            int left = 0;
            int right = width - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            if (matrix[i][left] == target) return true;
        }

        return false;
    }
}
