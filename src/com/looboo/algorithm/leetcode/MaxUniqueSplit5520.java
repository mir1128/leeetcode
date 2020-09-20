package com.looboo.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MaxUniqueSplit5520 {
    public int maxUniqueSplit(String s) {
        int pow = (int) Math.pow(2, s.length() - 1);

        int max = 1;
        for (int i = 0; i < pow; i++) {
            String partition = partition(i, s.length()-1);
            int length = partitionLength(s, partition).size();
            if (max < length) {
                max = length;
            }
        }
        return max;
    }

    private Set<String> partitionLength(String s, String partition) {
        Set<String> stringSet = new HashSet<>();

        int last = 0;
        for (int i = 0; i < partition.length(); i++) {
            if (partition.charAt(i) == '0') continue;
            stringSet.add(s.substring(last, i+1));
            last = i + 1;
        }
        stringSet.add(s.substring(last));
        return stringSet;
    }

    private String partition(int i, int total) {
        String format = "%" + total + "s";
        return String.format(format, Integer.toBinaryString(i)).replace(' ', '0');
    }

    public static void main(String[] args) {
        String s = "gahbag";
        System.out.println(new MaxUniqueSplit5520().maxUniqueSplit(s));
    }

}
