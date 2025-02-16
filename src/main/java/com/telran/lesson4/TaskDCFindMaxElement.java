package com.telran.lesson4;

public class TaskDCFindMaxElement {

    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        int left = 0;
        int right = ints.length - 1;

        System.out.println(getPeak(ints, left, right));

    }

    public static int getPeak(int[] ints, int left, int right) {
        int mid = left + (right - left) / 2;
        //base case
        if (ints[mid - 1] < ints[mid] && ints[mid] > ints[mid + 1]) {
            return ints[mid];
        }
        if (ints[mid - 1] < ints[mid] && ints[mid] < ints[mid + 1]) {
            return getPeak(ints, mid + 1, right);
        } else {
            return getPeak(ints, left, mid - 1);
        }
    }
}
