package com.telran.lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Lemonade Change :
 * <p>
 * $5 - cost one portion of lemonade
 * <p>
 * $5, 10, 20
 * <p>
 * bills = [5,5,5,10,20] register is empty ($0) first pay $5 || register : $5 second pay $5 || register : $5 , $5 third pay $5 || register : $5, $5, $5 fourth pay $10|| register : $5, $5, $10 fifth pay $20 || register : $5, $20
 * <p>
 * bills = [5,5,10,10,20] first pay $5 || register : $5 second pay $5 || register : $5 , $5 third pay $10 || register : $5, $10 fourth pay $10|| register : $10, $10
 * <p>
 * fifth pay $20 || register : $10, $10
 * <p>
 * bills = [20] first pay $20 || register : $0
 * <p>
 * 5 5 5 10 => 20 - 10 + 5 = > 5 5 => 10 - 5 = > 5 5 5 5 10 => 20 - 5 + 5 + 5 => 10 => 10
 */

public class Homework {

    public static void main(String[] args) {
        Map<Integer, Integer> bills = new HashMap<>();
        bills.put(5, 0);
        bills.put(10, 0);
        bills.put(20, 0);
        Scanner data = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the amount (5, 10, or 20):");
            int bill = data.nextInt();

            if (bill != 5 && bill != 10 && bill != 20) {
                System.out.println("Invalid amount, try again.");
                continue;
            }
            if (bill == 5) {
                bills.put(5, bills.getOrDefault(5, 0) + 1);
                System.out.println("Take your lemonade!");
            } else if (bill == 10) {
                if (bills.get(5) > 0) {
                    bills.put(10, bills.getOrDefault(10, 0) + 1);
                    bills.put(5, bills.getOrDefault(5, 0) - 1);
                    System.out.println("Your change is 5. Take your lemonade!");
                } else {
                    System.out.println("Not enough change! Try again.");
                    continue;
                }
            } else {
                if (bills.get(10) > 0 && bills.get(5) > 0) {
                    bills.put(10, bills.getOrDefault(10, 0) - 1);
                    bills.put(5, bills.getOrDefault(5, 0) - 1);
                    bills.put(20, bills.getOrDefault(20, 0) + 1);
                    System.out.println("Your change is 15. Take your lemonade!");
                } else if (bills.get(5) >= 3) {
                    bills.put(5, bills.getOrDefault(5, 0) - 3);
                    bills.put(20, bills.getOrDefault(20, 0) + 1);
                    System.out.println("Your change is 15. Take your lemonade!");
                } else {
                    System.out.println("Not enough change! Try again.");
                    continue;
                }
            }
        }
    }
}
