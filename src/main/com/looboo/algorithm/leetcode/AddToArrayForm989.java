package com.looboo.algorithm.leetcode;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayForm989 {
    public List<Integer> addToArrayForm(int[] A, int K) {

        char[] chars = String.valueOf(K).toCharArray();

        List<Integer> result = new LinkedList<>();

        int carry = 0;
        int i = 0;
        for (; i < Math.min(A.length, chars.length); i++) {
            int a = A[A.length - 1 - i] + (chars[chars.length - 1 - i] - '0') + carry;
            if (a >= 10) {
                carry = 1;
                result.add(0, a - 10);
            } else {
                carry = 0;
                result.add(0, a);
            }
        }

        if (i == A.length && i == chars.length) {
            if (carry == 1) result.add(0, 1);
        } else if (i == A.length) {
            while (i < chars.length) {
                int a = (chars[chars.length - 1 - i] - '0') + carry;
                if (a >= 10) {
                    carry = 1;
                    result.add(0, a - 10);
                } else {
                    carry = 0;
                    result.add(0, a);
                }
                i++;
            }
            if (carry == 1) result.add(0, 1);
        } else {
            while (i < A.length) {
                int a = A[A.length - 1 - i] + carry;
                if (a >= 10) {
                    carry = 1;
                    result.add(0, a - 10);
                } else {
                    carry = 0;
                    result.add(0, a);
                }
                i++;
            }
            if (carry == 1) result.add(0, 1);
        }
        return result;
    }
}

