package com.telran.lesson6;

/**
 * 1 - Left, Right (reverse, two sum, greedy)
 * 2 - Slow, Fast (linked list, happy number)
 * 3 - Pair (first, second)
 */

public class TwoPointers {

    public static void main(String[] args) {
        String string = "Hello world!";
        int left = 0;
        int right = string.length() - 1;
        char[] chars = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(i);
        }

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        System.out.println(chars);
    }
}
