package com.telran.lesson3.homework;

public class TaskOne {

    public static void main(String[] args) {
        reverse("Hello Java!");
    }

    public static void reverse(String string) {
        if (string.isEmpty()) {
            return;
        }
        System.out.print(string.charAt(string.length() - 1));
        reverse(string.substring(0, string.length() - 1));
    }
}
