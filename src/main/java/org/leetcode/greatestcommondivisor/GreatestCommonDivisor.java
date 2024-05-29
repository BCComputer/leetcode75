package org.leetcode.greatestcommondivisor;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        String str2 = "ABABAB";
        String str1 = "AB";
        System.out.println(findGCD(str1, str2));
    }
    /*
    For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t
    (i.e., t is concatenated with itself one or more times).
    Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

    eg. Input: str1 = "ABCABC", str2 = "ABC"
    Output: "ABC"
     */

    public static String findGCD(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return findGCD(str2, str1);
        }
        if (str2.equals(str1)) {
            return str1;
        }
        if (str1.startsWith(str2)) {
            return findGCD(str1.substring(str2.length()), str2);
        }
        return "";


    }
}

