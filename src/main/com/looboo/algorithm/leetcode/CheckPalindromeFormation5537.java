package com.looboo.algorithm.leetcode;

public class CheckPalindromeFormation5537 {
    public boolean checkPalindromeFormation(String a, String b) {
        return test(a, b) || test(b, a);
    }

    private boolean test(String a, String b) {
        int pala = pal(a);

        if (pala == 0) return true;

        int palb = pal(b);
        if (palb == 0) return true;

        int i = 0;
        while (i < a.length() && a.charAt(i) == b.charAt(a.length() - 1 - i)) {
            ++i;
        }

        if (i >= pala - 1 || i >= palb - 1) return true;

        return palb <= i;
    }

    private int pal(String s) {
        int pos = s.length() / 2;
        while (pos >= 0 && (s.charAt(pos) == s.charAt(s.length() - 1 - pos))) {
            --pos;
        }

        ++pos;
        return pos;
    }
}
