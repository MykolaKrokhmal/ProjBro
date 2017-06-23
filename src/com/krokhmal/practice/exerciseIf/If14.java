package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 29.05.2017.
 */
public class If14 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Write min, then max number from three entered.");
        System.out.println("-------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 of 3 values: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter 2 of 3 values: ");
        int secondValue = scanner.nextInt();

        System.out.print("Enter 3 of 3 values: ");
        int thirdValue = scanner.nextInt();

        //Search min value
        int minValue = firstValue;
        if (minValue > secondValue) minValue = secondValue;
        if (minValue > thirdValue)  minValue = thirdValue;
        //Search max value
        int maxValue = firstValue;
        if (maxValue < secondValue) maxValue = secondValue;
        if (maxValue < thirdValue)  maxValue = thirdValue;

        System.out.println("=================================================");
        System.out.println("Result is min value is " + minValue + ", max value is " + maxValue);
    }
}
