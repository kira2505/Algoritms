package com.telran.lesson8;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        int[] array = {1, 3, 0, 2, 8, 54, 1, 33, 12, 4, 6, 5, 88};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int index = change(array, start, end);
            quickSort(array, start, index - 1);
            quickSort(array, index + 1, end);
        }
    }

    private static int change(int[] array, int start, int end) {
        int index = start;
        int value = array[end];
        for (int i = start; i <= end; i++) {
            if (array[i] < value) {
                swap(array, index, i);
                index++;
            }
        }
        swap(array, index, end);
        return index;
    }

    private static void swap(int[] array, int index, int i) {
        int temp = array[index];
        array[index] = array[i];
        array[i] = temp;
    }
}
