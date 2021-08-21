package com.looboo.algorithm.leetcode;
import java.util.HashMap;
import java.util.Map;

public class ShortestDistance243 {
    public int shortestDistance(String[] words, String word1, String word2) {

        Map<String, int[]> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            int finalI = i;
            map.compute(words[i], (k, v) -> v == null ? new int[] {finalI, finalI} : new int[] {Math.min(finalI, v[0]), Math.max(finalI, v[1])});
        }

        int a =  Math.min(Math.abs(map.get(word1)[0] - map.get(word2)[1]), Math.abs(map.get(word1)[1] - map.get(word2)[0]));
        int b = Math.min(Math.abs(map.get(word1)[0] - map.get(word2)[0]), Math.abs(map.get(word1)[1] - map.get(word2)[1]));

        return Math.min(a, b);
    }
}
