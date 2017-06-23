package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 27.05.2017.
 */
public class If05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------------------");
        System.out.println("Find quantity of positive and negative numbers.");
        System.out.println("------------------------------------------------------------");
        System.out.print("Enter 1 of 3 Value: ");

        int firstValue = scanner.nextInt();
        System.out.print("Enter 2 of 3 Value: ");

        int secondValue = scanner.nextInt();
        System.out.print("Enter 3 of 3 Value: ");

        int thirdValue = scanner.nextInt();

        int countPositiveValues = 0;
        int countNegativeValues = 0;
        if(firstValue >= 0) countPositiveValues++; else countNegativeValues++;
        if(secondValue >= 0) countPositiveValues++; else countNegativeValues++;
        if(thirdValue >= 0) countPositiveValues++; else countNegativeValues++;
        System.out.println("============================================================");
        System.out.println("Quantity negative values is " + countNegativeValues + ".");
        System.out.println("Quantity positive values is " + countPositiveValues + ".");
    }
}
