package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsHappy202 {
    public boolean isHappy(int n) {
        Set<Integer> possibles = new HashSet<>();

        while (!possibles.contains(n) && n != 1) {
            possibles.add(n);
            n = happyNumber(n);
        }

        if (n == 1) return true;

        return false;
    }

    private int happyNumber(int n) {
        List<Integer> numbers = new ArrayList<>();

        int remain = n;
        while (remain != 0) {
            numbers.add(remain%10);
            remain /= 10;
        }

        return numbers.stream().mapToInt(i -> i*i).sum();
    }

    public static void main(String[] args) {
        int i = 19;
        System.out.println(new IsHappy202().isHappy(19));
    }
}
