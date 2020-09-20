package com.looboo.algorithm.leetcode;

public class Utils {
    public static void print(int arr[]) {
        System.out.println(format(arr));
    }

    public static void print(int arr[][]) {
        System.out.println(format(arr));
    }

    public static String format(int arr[]) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(String.format("%16s", arr[i]));
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public static String format(int arr[][]) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                stringBuilder.append(String.format("%16s", arr[i][j]));
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }


}
