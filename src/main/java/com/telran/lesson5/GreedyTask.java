package com.telran.lesson5;

import java.util.Arrays;

public class GreedyTask {

    public static void main(String[] args) {
        int[] people = {10, 55, 70, 20, 90, 85};
        int[] people2 = {10,10,90,90};

        System.out.println(getNumberOfBoats(people, 100));
        System.out.println(getNumberOfBoats(people2, 100));

    }

    public static int getNumberOfBoats(int[] people, int limit){
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boat = 0;

        int currentWeight = 0;
        while (left <= right) {
            currentWeight = people[left] + people[right];
            while (currentWeight <= limit && left < right){
                left++;
                currentWeight += people[left];
            }
            boat ++;
            right --;
        }
        return boat;
    }
}
