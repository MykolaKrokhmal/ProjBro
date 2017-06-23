package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 30.05.2017.
 */
public class If23 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Enter three angles coordinates of rectangle. Borders parallel to ");
        System.out.println("coordinate lines. Find the fourth angle coordinate.");
        System.out.println("-------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X1 = X2 Value: ");
        int x1Value = scanner.nextInt();
        int x2Value = x1Value;
        System.out.print("Enter Y1 Value: ");
        int y1Value = scanner.nextInt();
        System.out.print("Enter Y2 = Y3 Value: ");
        int y2Value = scanner.nextInt();
        int y3Value = y2Value;
        System.out.print("Enter X3 Value: ");
        int x3Value = scanner.nextInt();

        int x4Value = x3Value;
        int y4Value = y1Value;
        System.out.println("=============================================================");
        System.out.println("Result fourth coordinate is (" + x4Value + ", " + y4Value + ")");
    }
}
