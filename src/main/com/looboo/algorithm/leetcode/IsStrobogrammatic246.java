package com.looboo.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsStrobogrammatic246 {
    public boolean isStrobogrammatic(String num) {

        if (num.length() == 0) return true;

        Map<Character, Character> map = new HashMap<>() {{
            put('0', '0');
            put('1', '1');
            put('6', '9');
            put('9', '6');
            put('8', '8');
        }};
        for (int i = 0; i <= num.length() / 2; i++) {
            if (map.get(num.charAt(i)) == null) return false;
            if (map.get(num.charAt(i)) != num.charAt(num.length()-1-i)) return false;
        }

        return true;
    }
}
