package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 27.05.2017.
 */
public class If08 {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------");
        System.out.println("Print greater and then less Value");
        System.out.println("------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 of 2 Value: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter 2 of 2 Value: ");
        int secondValue = scanner.nextInt();

        System.out.println("============================================================");
        if(firstValue >= secondValue)
            System.out.println("Result is " + firstValue + ", " + secondValue);
        else
            System.out.println("Result is " + secondValue + ", " + firstValue);
    }
}
