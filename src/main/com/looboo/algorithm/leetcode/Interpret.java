package com.looboo.algorithm.leetcode;

public class Interpret {
    public String interpret(String command) {

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < command.length()) {
            String substring = command.substring(index);
            if (substring.startsWith("G")) {
                stringBuilder.append("G");
                index += 1;
            } else if (substring.startsWith("()")) {
                stringBuilder.append("o");
                index += 2;
            } else if (substring.startsWith("(al)")) {
                stringBuilder.append("al");
                index += 4;
            } else {
                index += 1;
            }
        }

        return stringBuilder.toString();
    }
}
