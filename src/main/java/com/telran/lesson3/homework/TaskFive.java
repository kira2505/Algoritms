package com.telran.lesson3.homework;

public class TaskFive {

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println("Is Palindrome string " + s + "? " + isPalindrome(s, 0, s.length() - 1));
    }

    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindrome(s, left + 1, right - 1);
    }
}
