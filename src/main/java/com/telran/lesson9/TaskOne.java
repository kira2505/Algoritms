package com.telran.lesson9;

public class TaskOne {

    public static void main(String[] args) {
        int[] ints = {70, 10, 50, 30, 60, 40};
        int min = ints[0];
        int profit = 0;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            } else {
                profit = Math.max(profit, ints[i] - min);
            }
        }
        System.out.println(profit);
    }
}
