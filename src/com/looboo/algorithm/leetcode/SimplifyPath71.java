package com.looboo.algorithm.leetcode;

import java.util.Stack;
import java.util.stream.Collectors;

public class SimplifyPath71 {
    public String simplifyPath(String path) {
        String[] tokens = path.split("/");
        Stack<String> dirs = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].isEmpty() || tokens[i].equals(".")) {
                continue;
            } else if (tokens[i].equals("..")) {
                if (!dirs.isEmpty()) {
                    dirs.pop();
                }
            } else {
                dirs.push(tokens[i]);
            }
        }
        return "/" + dirs.stream().collect(Collectors.joining("/"));
    }

    public static void main(String[] args) {
    }
}
