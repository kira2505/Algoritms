package com.telran.lesson6;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {38, 3, 4, 1, 76, 44, 34, 98, 1, 4, 2, 6};
        System.out.println(Arrays.toString(mergeSort(array)));

    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        int[] leftResult = mergeSort(left);
        int[] rightResult = mergeSort(right);

        return merge(leftResult, rightResult);
    }

    public static int[] merge(int[] one, int[] two) {
        int[] resultArr = new int[one.length + two.length];
        int resultIndex = 0;
        int oneIndex = 0;
        int twoIndex = 0;

        while (oneIndex < one.length && twoIndex < two.length) {
            int oneElement = one[oneIndex];
            int twoElement = two[twoIndex];
            if (oneElement < twoElement) {
                resultArr[resultIndex] = oneElement;
                oneIndex++;
            } else {
                resultArr[resultIndex] = twoElement;
                twoIndex++;
            }
            resultIndex++;
        }

        while (oneIndex < one.length) {
            resultArr[resultIndex] = one[oneIndex];
            oneIndex++;
            resultIndex++;
        }

        while (twoIndex < two.length) {
            resultArr[resultIndex] = two[twoIndex];
            twoIndex++;
            resultIndex++;
        }

        return resultArr;
    }
}
