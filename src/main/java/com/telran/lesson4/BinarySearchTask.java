package com.telran.lesson4;

public class BinarySearchTask {

    public static void main(String[] args) {
        int[] ints = {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
        System.out.println("Element 3 is located at the index: " + binarySearch(ints, 10));
        int left = 0;
        int right = ints.length - 1;

        System.out.println("Element 50 is located at the index: " + recursionBinarySearch(ints, left, right, 50));

    }

    public static int binarySearch(int[] ints, int x) {
        int left = 0;
        int right = ints.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int element = ints[mid];
            if (element == x) {
                return mid;
            } else if (element < x) {
                left = mid + 1;
            } else if (element > x) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int recursionBinarySearch(int[] ints, int left, int right, int x) {
        int mid = left + (right - left) / 2;
        int element = ints[mid];

        //base case
        if (element == x) {
            return mid;
        }
        if (left > right) {
            return -1;
        }

        if (element < x) {
            return recursionBinarySearch(ints, mid + 1,right , x);
        } else {
            return recursionBinarySearch(ints, left, mid - 1, x);
        }
    }
}
