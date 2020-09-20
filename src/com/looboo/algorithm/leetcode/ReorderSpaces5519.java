package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReorderSpaces5519 {
    public String reorderSpaces(String text) {

        List<String> s = Arrays.asList(text.split(" ")).stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());

        int n = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') n++;
        }

        if (s.size() == 1) {
            return s.get(0) + repeat(' ', n);
        }

        StringBuilder stringBuilder = new StringBuilder();
        int count = n / (s.size()-1);

        for (int i = 0; i < s.size()-1; i++) {
            stringBuilder.append(s.get(i)).append(repeat(' ', count));
        }
        stringBuilder.append(s.get(s.size()-1));

        stringBuilder.append(repeat(' ', n % (s.size()-1)));

        return stringBuilder.toString();
    }

    private String repeat(char c , int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "  this   is  a sentence ";
        System.out.println(new ReorderSpaces5519().reorderSpaces(s));
    }
}
