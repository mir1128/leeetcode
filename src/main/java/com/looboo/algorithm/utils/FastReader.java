package com.looboo.algorithm.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FastReader {
    public static int[] read(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        List<Integer> list = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            list.add(Integer.parseInt(tokenizer.nextToken()));
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] read(InputStream inputStream, int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int[] nums = new int[n];
        int i = 0;
        while (tokenizer.hasMoreTokens()) nums[i++] = Integer.parseInt(tokenizer.nextToken());
        return nums;
    }
}
