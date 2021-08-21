package com.looboo.algorithm.leetcode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class NestedIterator341 {

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


    public static class NestedIterator implements Iterator<Integer> {

        Stack<NestedInteger> stack = new Stack<>();

        public NestedIterator(List<NestedInteger> nestedList) {
            pushList(nestedList);
        }

        @Override
        public Integer next() {

            if (stack.isEmpty()) return null;

            NestedInteger top = stack.pop();
            while (!top.isInteger()) {
                pushList(top.getList());
                if (stack.isEmpty()) break;
                top = stack.pop();
            }
            return top.getInteger();
        }

        private void pushList(List<NestedInteger> nestedList) {
            for (int i = nestedList.size() - 1; i >= 0; --i) {
                stack.push(nestedList.get(i));
            }
        }

        @Override
        public boolean hasNext() {
            Integer next = next();
            boolean res = (next != null);

            if (next != null) {
                stack.push(new NestedInteger() {
                    @Override
                    public boolean isInteger() {
                        return true;
                    }

                    @Override
                    public Integer getInteger() {
                        return next;
                    }

                    @Override
                    public List<NestedInteger> getList() {
                        return null;
                    }
                });
            }
            return res;
        }
    }

    public static void main(String[] args) {
        NestedIntegerList l1 = new NestedIntegerList(Arrays.asList(new NestedIntegerImpl(1),
                new NestedIntegerImpl(1)));
        NestedIntegerImpl n = new NestedIntegerImpl(2);
        NestedIntegerList l2 = new NestedIntegerList(Arrays.asList(new NestedIntegerImpl(1),
                new NestedIntegerImpl(1)));

        List<NestedInteger> nestedIntegers = Arrays.asList(l1, n, l2);

        NestedIterator nestedIterator = new NestedIterator(nestedIntegers);
        while (nestedIterator.hasNext()) {
            System.out.println(nestedIterator.next());
        }
    }
}
