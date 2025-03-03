package com.telran.lesson7;

import java.util.Arrays;

public class PatternTwo_TwoPointers_SlowFast {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 2, 2, 3, 2, 0, 4, 2};
        int remote = 2;

        int slow = 0;
        for (int fast = 0; fast < numbers.length; fast++) {
            if (numbers[fast] != remote) {
                numbers[slow++] = numbers[fast];
            }
        }
        System.out.println(slow);
        System.out.println(Arrays.toString(numbers));

        for (int i = slow; i < numbers.length; i++) {
            numbers[i] = -1;
        }
        System.out.println(Arrays.toString(numbers));
        //Time complexity O(n)
    }
}
