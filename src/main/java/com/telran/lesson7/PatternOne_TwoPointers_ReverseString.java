package com.telran.lesson7;

import java.util.Arrays;

/**
 * 1 - Left, Right (reverse, two sum, greedy)
 * 2 - Slow, Fast (linked list, happy number)
 * 3 - Pair (first, second)
 *
 * 1) Reverse string
 * 2) Two sum
 * 3) Squares of arrays
 */

public class PatternOne_TwoPointers_ReverseString {

    public static void main(String[] args) {
        String string = "Hello world!";
        char[] chars = string.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        System.out.println(Arrays.toString(chars));
        //Time complexity O(n)
    }
}
