package com.telran.lesson7;

import java.util.Arrays;

public class PatternOne_TwoPointers_SquaresOfArrays {

    public static void main(String[] args) {
        int[] numbers = {-4, -1, 0, 3, 10};
        int[] result = new int[numbers.length];
        int left = 0;
        int right = numbers.length - 1;
        int index = result.length - 1;

        while (index >= 0) {
            int numberRight = numbers[right] * numbers[right];
            int numberLeft = numbers[left] * numbers[left];
            if (numberLeft > numberRight) {
                result[index] = numberLeft;
                left++;
            } else {
                result[index] = numberRight;
                right--;
            }
            index--;
        }
        System.out.println(Arrays.toString(result));
        //Time complexity O(n)
    }
}
