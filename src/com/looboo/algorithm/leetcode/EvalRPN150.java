package com.looboo.algorithm.leetcode;

import java.util.Stack;

public class EvalRPN150 {

    private static enum OPERATORS {
        ADD,
        SUB,
        MUL,
        DIV,
        NONE
    }

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            OPERATORS operator = operator(tokens[i]);
            if (operator != OPERATORS.NONE) {
                int right = stack.pop();
                int left = stack.pop();

                if (operator.equals(OPERATORS.ADD)) stack.push(left + right);
                if (operator.equals(OPERATORS.SUB)) stack.push(left - right);
                if (operator.equals(OPERATORS.MUL)) stack.push(left * right);
                if (operator.equals(OPERATORS.DIV)) stack.push(left / right);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }

        return stack.pop();
    }

    private OPERATORS operator(String o) {
        if (o.equals("+")) return OPERATORS.ADD;
        if (o.equals("-")) return OPERATORS.SUB;
        if (o.equals("*")) return OPERATORS.MUL;
        if (o.equals("/")) return OPERATORS.DIV;
        return OPERATORS.NONE;
    }
}
