package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AreSentencesSimilar734 {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) return false;
        Map<String, List<String>> map = new HashMap<>();
        Map<String, List<String>> map1 = new HashMap<>();

        for (int i = 0; i < similarPairs.size(); i++) {
            map.computeIfAbsent(similarPairs.get(i).get(0), k -> new ArrayList<>()).add(similarPairs.get(i).get(1));
            map1.computeIfAbsent(similarPairs.get(i).get(1), k -> new ArrayList<>()).add(similarPairs.get(i).get(0));
        }

        for (int i = 0; i < sentence1.length; i++) {
            if (!sentence1[i].equals(sentence2[i])
                    && ((!map.containsKey(sentence1[i]) || !map.get(sentence1[i]).contains(sentence2[i])))
                    && ((!map1.containsKey(sentence1[i]) || !map1.get(sentence1[i]).contains(sentence2[i])))
            ) return false;
        }
        return true;
    }
}
