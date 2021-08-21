package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordBreak139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            List<String> words = words(s, i, wordDict);

            for (int j = 0; j < words.size(); j++) {
                if (i + 1 - words.get(j).length() == 0 || dp[i - words.get(j).length()]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()-1];
    }

    private List<String> words(String s, int index, List<String> wordDict) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);
            if (index + 1 >= word.length() && word.equals(s.substring(index + 1 - word.length(), index + 1))) {
                result.add(word);
            }
        }
        return result;
    }
}
