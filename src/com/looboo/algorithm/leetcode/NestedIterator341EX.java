package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NestedIterator341EX {

    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

    public static class NestedIntegerImpl implements NestedInteger {

        private Integer value;

        public NestedIntegerImpl(Integer value) {
            this.value = value;
        }

        @Override
        public boolean isInteger() {
            return true;
        }

        @Override
        public Integer getInteger() {
            return value;
        }

        @Override
        public List<NestedInteger> getList() {
            return null;
        }
    }

    public static class NestedIntegerList implements NestedInteger {

        private List<NestedInteger> list;

        public NestedIntegerList(List<NestedInteger> list) {
            this.list = list;
        }

        @Override
        public boolean isInteger() {
            return list.size() == 1;
        }

        @Override
        public Integer getInteger() {
            return list.get(0).getInteger();
        }

        @Override
        public List<NestedInteger> getList() {
            return list;
        }
    }

    public static class Command {
        public String operator;
        public NestedIntegerImpl value;
        public NestedIntegerList list;

        public Command(String operator, NestedIntegerImpl value, NestedIntegerList list) {
            this.operator = operator;
            this.value = value;
            this.list = list;
        }
    }

    public List<NestedInteger> build(String s) {
        Stack<Command> stack = new Stack<>();

        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '[') {
                stack.push(new Command("left", null, null));
                ++i;
            } else if ('0' <= c && c <= '9') {
                int j = i + 1;
                for (; j < s.length(); j++) {
                    char c1 = s.charAt(j);
                    if (!('0' <= c1 && c1 <= '9')) break;
                }
                stack.push(new Command("digit", new NestedIntegerImpl(Integer.valueOf(s.substring(i, j))), null));
                i = j;
            } else if (',' == c) {
                ++i;
                continue;
            } else if (']' == c) {
                Command top = stack.pop();
                List<NestedInteger> integers = new LinkedList<>();
                while (top.operator.equals("digit") || top.operator.equals("list")) {
                    if (top.operator.equals("digit")) {
                        integers.add(0, top.value);
                    }
                    if (top.operator.equals("list")) {
                        integers.add(0, top.list);
                    }

                    if (!stack.isEmpty()) {
                        top = stack.pop();
                    }
                }
                System.out.println("pop a list, top should be " + top.operator);
                stack.push(new Command("list", null, new NestedIntegerList(integers)));
                ++i;
            }
        }
        Command pop = stack.pop();
        return pop.list.getList();
    }

    public static class NestedIterator implements Iterator<Integer> {

        private List<Integer> result = new ArrayList<>();
        private int current = 0;

        public NestedIterator(List<NestedInteger> nestedList) {

            Stack<NestedInteger> stack = new Stack<>();

            for (int i = nestedList.size() - 1; i >= 0; --i) {
                stack.push(nestedList.get(i));
            }

            NestedInteger top = null;
            while (!stack.isEmpty()) {
                top = stack.pop();
                if (top.isInteger()) {
                    result.add(top.getInteger());
                } else {
                    List<NestedInteger> list = top.getList();
                    for (int i = list.size() -1 ; i >= 0; --i) {
                        stack.push(list.get(i));
                    }
                }
            }
        }

        @Override
        public boolean hasNext() {
            return current < result.size();
        }

        @Override
        public Integer next() {
            return result.get(current++);
        }
    }


    public static void main(String[] args) {
        List<NestedInteger> nestedIntegers = new NestedIterator341EX().build("[[1,1],2,[1,1]]");

        NestedIterator nestedIterator = new NestedIterator(nestedIntegers);

        while (nestedIterator.hasNext()) {
            System.out.println(nestedIterator.next());
        }
    }
}
