package com.telran.lesson10;

public class TaskTwo {

    public static void main(String[] args) {
        int[] array = {2, 1, 5, 2, 3, 2};
        int sum = 7;
        System.out.println(findSubArraySum(array, sum));
    }

    private static int findSubArraySum(int[] array, int sum) {
        int currSum = 0;
        int start = 0;
        int minLength = 7658493;
        for (int i = 0; i < array.length; i++) {
            currSum += array[i];
            while (currSum >= sum) {
                int currentLength = i - start + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                }
                currSum = currSum - array[start];
                start++;
            }
        }
        return minLength;
    }
}
