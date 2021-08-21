package com.looboo.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartitionLabels763 {
    public List<Integer> partitionLabels(String s) {
        Set<Character> characterSet = new HashSet<>();

        int index = 0;
        List<Integer> result = new ArrayList<>();
        while (index < s.length()) {
            int last = s.lastIndexOf(s.charAt(index));
            if (last == index) {
                result.add(1);
                index++;
            } else {
                for (int i = index; i <= last; i++) {
                    characterSet.add(s.charAt(i));
                }

                int temp = last + 1;
                int nextPos = last;
                for (; temp < s.length(); temp++) {
                    if (characterSet.contains(s.charAt(temp))) {
                        for (int i = last + 1; i < temp; i++) {
                            characterSet.add(s.charAt(i));
                        }
                        nextPos = temp;
                    }
                }
                result.add(nextPos + 1 - index);
                index = nextPos + 1;
            }
        }
        return result;
    }
}
