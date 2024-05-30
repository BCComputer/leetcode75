package org.leetcode.reversevowelofstring;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ReverseVowelOfString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseVowelsOfString(str));
    }
    public static String reverseVowelsOfString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        Stack<Character> stack = new Stack<>();

        System.out.println(str.toCharArray());

        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                stack.push(c);
            }
        }

        System.out.println(stack);

        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                result.append(stack.pop());
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
