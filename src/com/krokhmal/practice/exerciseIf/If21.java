package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 30.05.2017.
 */
public class If21 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("If point coordinates (0,0) print 0, if (X,0) or (0,Y) print 1 or 2, else print 3");
        System.out.println("--------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X value: ");
        int xValue = scanner.nextInt();
        System.out.print("Enter Y value: ");
        int yValue = scanner.nextInt();
        int result = -1;

        if (xValue == 0 && yValue == 0) result = 0;
        else if (xValue == 0 && yValue != 0) result = 1;
        else if (xValue != 0 && yValue == 0) result = 2;
        else if (xValue != 0 && yValue != 0) result = 3;

        System.out.println("================================================================================");
        System.out.println("Result is " + result);
    }
}