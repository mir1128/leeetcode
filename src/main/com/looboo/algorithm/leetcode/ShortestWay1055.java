package com.looboo.algorithm.leetcode;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShortestWay1055 {
    public int shortestWay(String source, String target) {

        Set<Character> sourceChars = IntStream.range(0, source.length()).mapToObj(i -> source.charAt(i)).collect(Collectors.toSet());
        Set<Character> targetChars = IntStream.range(0, target.length()).mapToObj(i -> target.charAt(i)).collect(Collectors.toSet());

        if (!sourceChars.containsAll(targetChars)) {
            return -1;
        }

        int index = 0;
        int res = 0;
        while (index < target.length()) {
            int sourceIndex = 0;
            while (true) {
                while (sourceIndex < source.length()
                        && index < target.length()
                        && source.charAt(sourceIndex) != target.charAt(index)) {
                    sourceIndex++;
                }
                if (sourceIndex == source.length() || index == target.length()) {
                    res++;
                    break;
                }
                sourceIndex++;
                index++;
            }
        }
        return res;
    }

}
