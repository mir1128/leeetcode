package com.looboo.algorithm.luogu.list02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.next();
        }

        Arrays.sort(nums, new StringComparator().reversed());

        System.out.println(String.join("", nums));
    }


    public static class StringComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            String a = s1 + s2;
            String b = s2 + s1;

            return a.compareTo(b);
        }
    }
}
