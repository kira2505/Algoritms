package com.telran.lesson8;

import java.util.Arrays;

public class QuickSortExample {

    public static void main(String[] args) {
        int[] ints = {7, -2, 4, 1, 6, 5, 0, -4, 2};
        System.out.println(Arrays.toString(ints));
        quickSort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }

    private static void quickSort(int[] ints, int start, int end){
        if(start < end) {
            int index = change(ints, start, end);
            quickSort(ints, start, index - 1);
            quickSort(ints, index + 1, end);
        }
    }

    private static int change(int[] ints, int start, int end) {
        int index = start;
        int value = ints[end];
        for (int i = start; i <= end - 1; i++) {
            if (ints[i] < value) {
                swap(ints, index, i);
                index++;
            }
        }
        swap(ints, index, end);
        return index;
    }

    private static void swap(int[] array, int index, int i) {
        int temp = array[index];
        array[index] = array[i];
        array[i] = temp;
    }
}
