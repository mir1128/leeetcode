package com.looboo.algorithm.leetcode;

public class IsPalindrome125 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (!Character.isAlphabetic(s.charAt(left)) && !Character.isDigit(s.charAt(left))) {
                ++left;
                continue;
            }
            if (!Character.isAlphabetic(s.charAt(right)) && !Character.isDigit(s.charAt(right))) {
                --right;
                continue;
            }

            if (Character.toUpperCase(s.charAt(left)) == Character.toUpperCase(s.charAt(right)))  {
                left++;
                right--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(new IsPalindrome125().isPalindrome(s));
    }
}
