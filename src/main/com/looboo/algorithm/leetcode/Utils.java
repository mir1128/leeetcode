package com.looboo.algorithm.leetcode;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Utils {
    public static void print(int arr[]) {
        System.out.println(format(arr));
    }

    public static void print(double arr[]) {
        System.out.println(format(arr));
    }

    public static void print(boolean arr[]) {
        System.out.println(format(arr));
    }

    public static void print(double arr[][]) {
        System.out.println(format(arr));
    }

    public static void print(int arr[][]) {
        System.out.println(format(arr));
    }

    public static void print(boolean arr[][]) {
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

    public static String format(boolean arr[]) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(String.format("%16s", arr[i]));
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public static String format(double arr[]) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(String.format("%16.4f", arr[i]));
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public static String format(double arr[][]) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                stringBuilder.append(String.format("%16.4f", arr[i][j]));
            }
            stringBuilder.append("\n");
        }
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

    public static String format(boolean arr[][]) {

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

    public static int[] intArray1d(String s) {
        String arr = s.substring(1, s.length() - 1);
        return Stream.of(arr.split(","))
                .map(String::trim)
                .filter(i -> !i.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int[][] intArray2d(String s) {
        String arr = s.substring(1, s.length() - 1);

        List<int[]> result = new ArrayList<>();
        int i = 0;
        while (i < arr.length()) {
            int closeEnd = arr.indexOf(']', i);
            if (closeEnd == -1) break;
            int[] section = intArray1d(arr.substring(i, closeEnd + 1));
            result.add(section);
            i = closeEnd + 1;
            i = arr.indexOf('[', i);
            if (i == -1) break;
        }

        int [][] res = new int[result.size()][result.get(0).length];
        for (int j = 0; j < result.size(); j++) {
            res[j] = result.get(j);
        }
        return res;
    }
}
