package com.telran.lesson5;

public class ValidPalindromeExample {

    public static void main(String[] args) {
        String exampleOne = "racecar";
        String exampleTwo = "abccdba";
        String exampleThree = "abcdef";

        System.out.println(isPalindrome(exampleOne));
        System.out.println(isPalindrome(exampleTwo));
        System.out.println(isPalindrome(exampleThree));

    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            if (l == r) {
                left++;
                right--;
            } else {
                return check(str, left + 1, right) || check(str, left, right - 1);
            }
        }
        return true;
    }

    public static boolean check(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
