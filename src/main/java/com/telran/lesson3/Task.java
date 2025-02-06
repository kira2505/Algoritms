package com.telran.lesson3;

public class Task {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        print(5);

    }


    public static int print(int k) {
        if (k == 1) {
            return 1;
        }
        int n = print(k - 1);
        int sum = k + n;
        System.out.println(sum);
        return sum;
    }
}
