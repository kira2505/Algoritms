package com.telran.lesson3.homework;

public class TaskFour {

    public static void main(String[] args) {
        System.out.println(degreeConversion(3, 3));
    }

    public static int degreeConversion(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * degreeConversion(a, b - 1);
    }
}
