package com.looboo.algorithm.leetcode;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Stream;

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

    public static int[] loadFromTxt(String filename) throws IOException {
        InputStream inputStream = Utils.class.getClassLoader().getResourceAsStream(filename);
        String s = IOUtils.toString(inputStream, "UTF-8");
        s = s.substring(1, s.length() - 1);
        String[] split = s.split(",");
        return Stream.of(split).filter(str -> !str.trim().isEmpty()).mapToInt(Integer::valueOf).toArray();
    }

}
