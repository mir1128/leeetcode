package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream5601 {
    private String[] store;
    private int ptr;

    public OrderedStream5601(int n) {
        store = new String[n + 1];
        ptr = 1;
    }

    public List<String> insert(int id, String value) {
        store[id] = value;

        List<String> result = new ArrayList<>();
        int i = ptr;
        for (; i < store.length; i++) {
            if (store[i] == null) {
                break;
            } else {
                result.add(store[i]);
            }
        }
        if (!result.isEmpty()) {
            ptr = i;
        }
        return result;
    }
}
