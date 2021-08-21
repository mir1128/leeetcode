package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxForm474 {

    public int findMaxForm(String[] strings, int m, int n) {

        if (strings.length == 0) {
            return 0;
        }

        if (strings.length == 1) {
            Pair<Integer, Integer> count = count(strings[0]);
            if (count.first <= m && count.second <= n) {
                return 1;
            } else {
                return 0;
            }
        }

        List<String> strings1 = Arrays.stream(strings)
                .filter(s -> fit(s, m, n))
                .collect(Collectors.toList());
        int max = 0;
        for (int i = 0; i < strings1.size(); ++i) {

            Pair<Integer, Integer> countStringI = count(strings1.get(i));

            List<String> strings2 = new ArrayList<>();
            strings2.addAll(strings1);
            strings2.remove(i);

            String[] strings3 = strings2.toArray(new String[strings2.size()]);

            int includeStringI = findMaxForm(strings3, m - countStringI.first, n - countStringI.second);
            int excludeStringI = findMaxForm(strings3, m, n);

            int temp = 0;
            if (includeStringI + 1 > excludeStringI) {
                temp = includeStringI + 1;
            } else {
                temp = excludeStringI;
            }
            if (temp > max) max = temp;
        }
        return max;
    }

    private Pair<Integer, Integer> count(String s) {
        int one = 0;
        int zero = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '0') zero++;
            if (s.charAt(i) == '1') one++;
        }
        return new Pair<>(zero, one);
    }

    private boolean fit(String s, int m, int n) {
        Pair<Integer, Integer> count = count(s);
        return count.first <= m && count.second <= n;
    }

    private static class Pair<T, U> {
        public T first;
        public U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"0","0","1","1"};

        int maxForm = new FindMaxForm474().findMaxForm(arr, 2, 2);

        System.out.println(maxForm);
    }

}
