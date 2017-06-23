package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Enter K and N (N > 0). Write N K times.");
        System.out.println("--------------------------------------------------------------");

        System.out.print("Enter K: ");
        int kValue = scanner.nextInt();
        System.out.print("Enter N: ");
        int nValue = scanner.nextInt();

        if (nValue <=0)
            System.out.println("Please enter N greater then zero. Restart program.");
        else {
            System.out.println("==========================================================");
            for (int i = 0; i  <= kValue; i++)
                System.out.print(nValue + " ");
        }
        scanner.close();
    }
}
