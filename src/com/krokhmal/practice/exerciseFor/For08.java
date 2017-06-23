package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Enter A and B, A < B. Find multiply of all numbers between A and B with A,B");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.print("Enter A value: ");
        int aValue = scanner.nextInt();
        System.out.print("Enter B value: ");
        int bValue = scanner.nextInt();

        System.out.println("=================================================================================");
        if (aValue > bValue) {
            System.out.println("Please enter A < B");
        }
        else {
            int sumValue = aValue;
            for (int i = aValue + 1; i <= bValue; i++)
                sumValue *= i;
                System.out.println("Sum of digits between A and B is " + sumValue);
        }

        scanner.close();
    }
}
