package com.telran.lesson9;

public class TaskTwo {

    public static void main(String[] args) {
        int[] array = {1, 7, 3, 6, 5, 6};
        int[] ints = {2,5,1,6,1};
        System.out.println(returnElement(array));
        System.out.println(returnElement(ints));
    }

    private static int returnElement(int[] array) {
        int left = 0;
        int leftIndex = 0;
        int right = 0;
        for (int num : array) {
            right += num;
        }
        while (leftIndex <= array.length) {
            right -= array[leftIndex];
            if (left == right) {
                return array[leftIndex];
            }
            left += array[leftIndex];
            leftIndex++;
        }
        return -1;
    }
}
