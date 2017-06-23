package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 27.05.2017.
 */
public class If06 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Print greater Value.");
        System.out.println("------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 of 2 Values: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter 2 of 2 Values: ");
        int secondValue = scanner.nextInt();

        System.out.println("============================================================");
        if(firstValue > secondValue) {
            System.out.println("Greater value is " + firstValue);
        }
        else{
            System.out.println("Greater value is " + secondValue);
        }
    }
}
