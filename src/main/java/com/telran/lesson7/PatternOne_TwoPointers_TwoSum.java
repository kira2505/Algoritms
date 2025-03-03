package com.telran.lesson7;

public class PatternOne_TwoPointers_TwoSum {

    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 4, 5, 7, 11, 15};
        int target = 9;
        int left = 0;
        int right = ints.length - 1;
        while (left < right) {
            if (ints[left] + ints[right] == target) {
                System.out.println("Index 1 = " + left + " index 2 = " + right);
                break;
            }
            if (ints[left] + ints[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        //Time complexity O(n)
    }
}
