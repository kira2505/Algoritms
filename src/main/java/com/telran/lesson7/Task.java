package com.telran.lesson7;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {
        int[] numbers = {0, 0, 1, 1, 1, 1, 2, 2, 3, 4, 5, 5};

        int slow = 0;
        for (int fast = 1; fast < numbers.length; fast++) {
            if (numbers[fast] != numbers[slow]) {
                numbers[slow + 1] = numbers[fast];
                slow++;
            }
        }

        for (int i = slow + 1; i < numbers.length; i++) {
            numbers[i] = -1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
