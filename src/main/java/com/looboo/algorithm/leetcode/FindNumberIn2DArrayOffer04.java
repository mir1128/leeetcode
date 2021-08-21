package com.looboo.algorithm.leetcode;

public class FindNumberIn2DArrayOffer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] firstElements = new int[m];
        int[] lastElements = new int[m];
        for (int i = 0; i < m; i++) {
            firstElements[i] = matrix[i][0];
            lastElements[i] = matrix[i][n - 1];
        }

        int lowerBound = lowerBound(firstElements, target);
        int upperBound = upperBound(lastElements, target);

        for (int i = Math.max(lowerBound, upperBound); i < m; i++) {
            if (exist(matrix[i], target)) {
                return true;
            }
        }
        return false;
    }

    private boolean exist(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left] == target;
    }

    private int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                right = left;
            }
        }
        return left;
    }

    private int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
