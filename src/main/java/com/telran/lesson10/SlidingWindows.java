package com.telran.lesson10;

/**
 * Sliding windows -
 */

public class SlidingWindows {

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        //length subarray = 5
        int index = array.length - 5;

//        for (int i = 0; i < index; i++) {
//            int sum = 0;
//            for (int j = 0; j < i + 4; j++) {
//                sum += array[j];
//            }
//            System.out.println(sum / 5);
//        }

        int sum = 0;
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (i >= 5 - 1) {
                System.out.println(sum / 5);
                sum = sum - array[start];
                start++;
            }
        }
    }
}
