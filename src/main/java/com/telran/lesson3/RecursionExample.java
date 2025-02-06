package com.telran.lesson3;

public class RecursionExample {

    public static void main(String[] args) {
        System.out.println("Iterate approach");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("Recurrent approach");
        printDigit(1);
        System.out.println("Recurrent reverse approach");
        printDigitReverse(10);
        System.out.println("");
        printDigitReverseTwo(6);
    }

    public static void printDigit(int n) {
        //base case
        if (n == 6) {
            return;
        }
        //recurrent case
        System.out.println(n);
        printDigit(n + 1);
    }

    public static void printDigitReverse(int k) {
        //base case
        if (k == 0) {
            return;
        }
        //recurrent case
        System.out.println(k);
        printDigitReverse(k - 1);
    }

    public static void printDigitReverseTwo(int k) {
        if (k == 0) {
            return;
        }
        printDigitReverseTwo(k - 1);
        System.out.println(k);
        //сначала метод вызывает сам себя до 0 потом возвращает значения в
        //обратном порядке
    }
}
