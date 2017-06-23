package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For29 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter int N (>1) and double A,B (A < B). Segment [A,B] cut on N equal segments. Write H - length ");
        System.out.println("of each segment and set of points A, A+H, A+2*H, ... , B.");
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

                for (int i = 0; i <= nValue; i++)
                    System.out.println("A + " + i + " * H = " + String.format("%.2f", (aValue + i * segmentLength)));


            }
        }

        scanner.close();
    }
}
