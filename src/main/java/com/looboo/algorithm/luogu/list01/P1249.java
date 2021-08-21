package com.looboo.algorithm.luogu.list01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P1249 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] solve = solve(scanner.nextInt());
        System.out.println(solve[0]);
        System.out.println(solve[1]);
    }

    private static String[] solve(int n) {

        int x = 2;
        while ((x - 1) * (x + 2) / 2 < n) {
            ++x;
        }
        int temp = (x - 1) * (x + 2) / 2;

        int[] nums = null;
        String max = null;
        if (temp == n) {
            nums = IntStream.range(2, x + 1).toArray();
            max = mul(nums);
        } else if (temp - n == 1) {
            nums = IntStream.range(3, x + 1).toArray();
            nums[nums.length - 1] += 1;
            max = mul(nums);
        } else {
            nums = IntStream.range(2, x + 1).filter(i -> i != temp - n).toArray();
            max = mul(nums);
        }
        String collect = Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        return new String[]{collect, max};
    }

    private static String mul(int[] nums) {
        String result = "1";
        for (int i = 0; i < nums.length; i++) {
            result = mul(result, nums[i]);
        }
        return result;
    }

    private static String mul(String first, int second) {
        int c = 0;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = first.length() - 1; i >= 0; i--) {
            int temp = (first.charAt(i) - '0') * second + c;
            c = temp / 10;
            stringBuilder.insert(0, temp % 10);
        }
        if (c != 0) {
            stringBuilder.insert(0, c);
        }
        return stringBuilder.toString();
    }
}
