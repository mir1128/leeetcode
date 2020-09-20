package com.looboo.algorithm.leetcode;

public class MaxDotProduct1458 {
    public int maxDotProduct(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = nums1[0] * nums2[0];
                } else if (i == 0 && j != 0) {
                    dp[0][j] = max(nums1[0] * nums2[j], dp[0][j - 1]);
                } else if (i != 0 && j == 0) {
                    dp[i][0] = max(nums1[i] * nums2[0], dp[i - 1][0]);
                } else {
                    dp[i][j] = max(nums1[i] * nums2[j], nums1[i] * nums2[j] + dp[i - 1][j - 1], dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1]);
                }
                System.out.println(String.format("i=%s,j=%s", i, j));
                Utils.print(dp);
                System.out.println("------------------------------");
            }
        }

        Utils.print(dp);
        return dp[m - 1][n - 1];
    }

    private int max(int... arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int arr1[] = {2, 1, -2, 5};
//        int arr2[] = {3, 0, -6};
//        int arr1[] = {-3, -8, 3, -10, 1, 3, 9};
//        int arr2[] = {9, 2, 3, 7, -9, 1, -8, 5, -1, -1};

//        int arr1[] = {3,-2};
//        int arr2[] = {2, -6, 7};
//
//        int arr1[] = {-1,-1};
//        int arr2[] = {1,1};

        int arr1[] = {-3, -8, 3, -10, 1, 3, 9};
        int arr2[] = {9, 2, 3, 7, -9, 1, -8, 5, -1, -1};

        System.out.println(new MaxDotProduct1458().maxDotProduct(arr1, arr2));
    }
}
