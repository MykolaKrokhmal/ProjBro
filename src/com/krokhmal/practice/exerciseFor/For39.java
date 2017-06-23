package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For39 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter positive int A,B (A < B). Write each number between A,B number value times.");
        System.out.println("-------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int A (>=0)...: ");
        int aValue = scanner.nextInt();

        if (aValue < 0) {
            System.out.println("A should be positive. Please restart the program.");
        }
        else {

            System.out.print("Enter int B ( A < B): ");
            int bValue = scanner.nextInt();

            if (aValue >= bValue) {
                System.out.println("B must be greater then A.");
            }
            else {
                System.out.println("=================================================================================================");

                for (int i = aValue; i <= bValue; i++) {
                    System.out.print("Result is :" );
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" " + i);
                    }
                    System.out.println("");
                }
            }
        }

        scanner.close();
    }
}
