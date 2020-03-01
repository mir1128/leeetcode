package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RestoreIpAddresses93 {

    public List<String> restoreIpAddresses(String s) {
        return restore(s, 0, 4);
    }

    private List<String> restore(String s, int index, int sections) {
        if (sections == 0) return new ArrayList<>();
        if (sections == 1) {
            String substring = s.substring(index);
            if (in(substring)) {
                return Arrays.asList(substring);
            } else {
                return new ArrayList<>();
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = index + 1; i < s.length(); ++i) {
            String temp = s.substring(index, i);
            if (in(temp)) {
                List<String> restore = restore(s, i, sections - 1);
                result.addAll(restore.stream().map(k -> temp + "." + k).collect(Collectors.toList()));
            } else {
                break;
            }
        }
        return result;
    }

    private boolean in(String s) {
        if (s.length() > 3) return false;

        int v = Integer.valueOf(s);

        if (s.charAt(0) == '0' && s.length() > 1) return false;

        return 0 <= v && v <= 255;
    }

    public static void main(String[] args) {
        String s = "010010";
        List<String> strings = new RestoreIpAddresses93().restoreIpAddresses(s);
        System.out.println(strings);
    }
}
