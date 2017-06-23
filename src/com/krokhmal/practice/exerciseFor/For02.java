package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter A and B (A < B). Write numbers between A and B with A.B.");
        System.out.println("--------------------------------------------------------------");

        System.out.print("Enter A: ");
        int aValue = scanner.nextInt();
        System.out.print("Enter B: ");
        int bValue = scanner.nextInt();

        System.out.println("==============================================================");
        if (aValue >= bValue) {
            System.out.println("Please enter A < B. Restart program.");
        }
        else {
            for (int i = aValue; i  <= bValue; i++)
                System.out.print(i + " ");
            System.out.println("- Count on numbers is " + (bValue - aValue + 1));
        }
        scanner.close();
    }
}
