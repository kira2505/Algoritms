package com.telran.lesson10;

public class TaskOne {

    public static void main(String[] args) {
        int[] array = {2,1,5,1,3,2};
        System.out.println(findMaxSumSubarray(array, 3));
    }

    private static int findMaxSumSubarray(int[] array, int subarray) {
        int sum = 0;
        int start = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (i >= subarray - 1) {
                sum = sum - array[start];
                start++;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
