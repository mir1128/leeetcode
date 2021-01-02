package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OriginalDigits {
    public String originalDigits(String s) {

//        Map<String, Integer> map = new HashMap<>() {{
//
//
//            put("nine", 9);
//
//            //-------------------
//            put("zero", 0); //z
//            put("six", 6); //x
//            put("eight", 8); //g,h
//            put("two", 2);//w
//            put("four", 4); //u
//            put("five", 5); //v
//            put("seven", 7); //s
//            put("three", 3); //t
//            put("one", 1);//o
//        }};

        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countMap.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        List<Integer> res = new ArrayList<>();
        process("eight", countMap, res, 'g', 8);
        process("six", countMap, res, 'x', 6);
        process("zero", countMap, res, 'z', 0);
        process("two", countMap, res, 'w', 2);
        process("four", countMap, res, 'u', 4);
        process("five", countMap, res, 'f', 5);
        process("seven", countMap, res, 's', 7);
        process("three", countMap, res, 't', 3);
        process("one", countMap, res, 'o', 1);
        process("nine", countMap, res, 'i', 9);

        res.sort(Comparator.comparingInt(i -> i));
        return res.stream().map(String::valueOf).collect(Collectors.joining());
    }

    private void process(String word, Map<Character, Integer> countMap, List<Integer> res, char g, int n) {
        if (countMap.containsKey(g)) {
            for (int i = 0; i < countMap.get(g); i++) {
                res.add(n);
            }
            decrease(countMap, word, countMap.get(g));
        }
    }

    private void decrease(Map<Character, Integer> countMap, String word, int n) {
        for (int i = 0; i < word.length(); i++) {
            countMap.compute(word.charAt(i), (k ,v) -> v-= n);
            if (countMap.get(word.charAt(i)) == 0) {
                countMap.remove(word.charAt(i));
            }
        }
    }
}
