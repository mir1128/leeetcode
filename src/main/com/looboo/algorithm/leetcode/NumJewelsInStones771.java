package com.looboo.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class NumJewelsInStones771 {

    public int numJewelsInStones(String J, String S) {

        Set<Character> set = IntStream
                .range(0, J.length())
                .mapToObj(J::charAt)
                .collect(HashSet::new, HashSet::add, HashSet::addAll);

        return (int) IntStream.range(0, S.length()).mapToObj(S::charAt).filter(set::contains).count();
    }
}
