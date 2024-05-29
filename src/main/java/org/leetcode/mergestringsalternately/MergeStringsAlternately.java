package org.leetcode.mergestringsalternately;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println("Challenge starts...");
        String one = "abc";
        String two = "xyz";
        String mergedString = mergeStringsAlternately(one, two);
        System.out.println("Result "+ mergedString);
        System.out.println("Result " + mergeString(one, two));
    }
    /*
     Merge Strings Alternately
     You are given two strings word1 and word2. Merge the strings by adding letters in
     alternating order, starting with word1. If a string is longer than the other,
     append the additional letters onto the end of the merged string.
     */
    public static String mergeStringsAlternately(String one, String two){
        int m = one.length(), n = two.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m || i < n; ++i) {
            if (i < m) {
                ans.append(one.charAt(i));
            }
            if (i < n) {
                ans.append(two.charAt(i));
            }
        }
        return ans.toString();
    }
    public static String mergeString(String firstWord, String secondWord){
        String mergeWord = "";
        int m = firstWord.length();
        int n = secondWord.length();
        int i = 0;
        int j = 0;

        while(i<m && j<n){
            mergeWord+=firstWord.charAt(i++);
            mergeWord+=secondWord.charAt(j++);
        }
        if(i<m){
            mergeWord+=firstWord.substring(i);
        }
        if(j<n){
            mergeWord+=secondWord.substring(j);
        }

        return mergeWord;
    }
}
