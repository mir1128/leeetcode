package com.looboo.algorithm.leetcode;

import java.util.stream.IntStream;

public class MaximumSum1186 {
    public int maximumSum(int[] arr) {

        if (arr.length == 1) return arr[0];

        int[] leftSide = new int[arr.length];
        leftSide[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftSide[i] = Math.max(leftSide[i - 1] + arr[i], arr[i]);
        }

        int[] rightSide = new int[arr.length];
        rightSide[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightSide[i] = Math.max(arr[i], rightSide[i+1] + arr[i]);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                max = max(max, arr[0] + rightSide[1], rightSide[1], arr[0]);
            } else if (i == arr.length-1) {
                max = max(max, arr[arr.length-1] + leftSide[arr.length-2], leftSide[arr.length-2], arr[arr.length-1]);
            } else {
                max = max(max,
                        leftSide[i-1] + arr[i] + rightSide[i+1],
                        leftSide[i-1] + rightSide[i+1],
                        arr[i] + rightSide[i+1],
                        arr[i] + leftSide[i-1],
                        arr[i],
                        rightSide[i+1],
                        leftSide[i-1]
                        );
            }
        }

        return max;
    }

    private int max(int ... values) {
        return IntStream.of(values).max().getAsInt();
    }

    public static void main(String[] args) {
        int arr[] = {-50};
        System.out.println(new MaximumSum1186().maximumSum(arr));
    }
}
