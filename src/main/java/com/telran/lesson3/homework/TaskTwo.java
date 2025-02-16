package com.telran.lesson3.homework;

public class TaskTwo {

    public static void main(String[] args) {
        System.out.println(returnSum(4));
    }

    public static int returnSum(int number) {
        if (number == 1) {
            return 1;
        }
        return number + returnSum(number - 1);
    }
}
