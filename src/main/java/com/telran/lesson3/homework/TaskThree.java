package com.telran.lesson3.homework;

public class TaskThree {

    public static void main(String[] args) {
        int[] ints = {2, 4, 6, 7, 8, 90, 7, 0};
        System.out.println(returnMaxValue(ints, ints.length));
    }

    public static int returnMaxValue(int[] ints, int n) {
        if (n == 1) {
            return ints[0];
        }
        return Math.max(ints[n - 1], returnMaxValue(ints, n - 1));
    }
}
