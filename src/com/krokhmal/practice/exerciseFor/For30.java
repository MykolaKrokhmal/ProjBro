package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For30 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter int N (>1) and double A,B (A < B). Segment [A,B] cut on N equal segments. Write H - length ");
        System.out.println("of each segment and function value F(X)=1-sin(X) in cutting [A,B] segment points,.");
        System.out.println("-------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int N (>1)......: ");
        int nValue = scanner.nextInt();

        if (nValue <= 1) {
            System.out.println("N should be greater then 1. Restart the program.");
        }
        else{
            System.out.print("Enter double A........: ");
            double aValue = scanner.nextDouble();

            System.out.print("Enter double B (A < B): ");
            double bValue = scanner.nextDouble();

            if (aValue >= bValue) {
                System.out.println("A should be less then B. Restart the program.");
            }
            else {
                double segmentLength = (bValue - aValue) / nValue;

                System.out.println("=================================================================================================");
                System.out.println("Length of one sigment H = " + String.format("%.2f", segmentLength));

                for (double i = aValue; i < bValue; i += segmentLength)
                    System.out.println("F( " + String.format("%.2f", i) + " ) = 1 - sin( "+ String.format("%.2f", i) + " ) = " + String.format("%.2f", (Math.sin(i))));
            }
        }

        scanner.close();
    }
}
