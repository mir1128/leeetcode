package com.looboo.algorithm.luogu.list03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class P1706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> result = permute(n);

        for (List<Integer> ints : result) {
            StringBuilder sb = new StringBuilder();
            for (Integer anInt : ints) {
                sb.append(String.format("%5s", anInt));
            }
            System.out.println(sb);
        }
    }

    private static List<List<Integer>> permute(int n) {
        Stack<Integer> stack = new Stack<>();
        List<List<Integer>> result = new ArrayList<>();
        permute(n, 0, stack, result);
        return result;
    }

    private static void permute(int n, int curr, Stack<Integer> stack, List<List<Integer>> result) {
        if (curr == n) {
            result.add(new ArrayList<>(stack));
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (stack.contains(i)) continue;
            stack.push(i);
            permute(n, curr+1, stack, result);
            stack.pop();
        }
    }


    private static List<List<Integer>> permute1(int n) {

        return null;
    }
}