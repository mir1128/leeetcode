package com.looboo.algorithm.leetcode;

public class IntToRoman12 {
    public String intToRoman(int num) {
        String s = "";
        int remain = num;
        int thousand = remain / 1000;
        remain = remain % 1000;
        if (thousand != 0) {
            s += repeat('M', thousand);
        }

        //[100, 999]
        if (remain >= 900) {
            s += "CM";
            remain -= 900;
        } else if (500 <= remain && remain < 900) {
            s += 'D';
            remain -= 500;
        } else if (400 <= remain && remain < 500) {
            s += "CD";
            remain -= 400;
        }

        if (100 <= remain && remain < 400) {
            int n = remain / 100;
            s += repeat('C', n);
            remain = remain % 100;
        }
        //        [0, 99]

        if (remain >= 90) {
            s += "XC";
            remain -= 90;
        } else if (50 <= remain && remain < 90) {
            s += 'L';
            remain -= 50;
        } else if (40 <= remain && remain < 50) {
            s += "XL";
            remain -= 40;
        }

        if (10 <= remain && remain < 40) {
            int n = remain / 10;
            s += repeat('X', n);
            remain = remain % 10;
        }

        if (remain == 9) {
            s += "IX";
            remain -= 9;
        } else if (5 <= remain && remain < 9) {
            s += 'V';
            remain -= 5;
        } else if (4 == remain) {
            s += "IV";
            remain -= 4;
        }
        if (remain > 0) {
            s += repeat('I', remain);
        }

        return s;
    }

    public String repeat(char c, int n) {
        return new String(new char[n]).replace('\0', c);
    }
}
