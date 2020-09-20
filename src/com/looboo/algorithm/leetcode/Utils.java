package com.looboo.algorithm.leetcode;

public class Utils {
    public static String print(int arr[]) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]).append("\t\t");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public static String print(int arr[][]) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                stringBuilder.append(arr[i][j]).append("\t\t");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
