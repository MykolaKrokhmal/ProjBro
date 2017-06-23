package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by User on 27.05.2017.
 */
public class If07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("Print order number of less Value.");
        System.out.println("------------------------------------------------------------");
        System.out.print("Enter first Value: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter second Value: ");
        int secondValue = scanner.nextInt();

        int orderNumber;
        if(firstValue <= secondValue) {
            orderNumber = 1;
        }
        else {
            orderNumber = 2;
        }

        System.out.println("============================================================");
        System.out.println("Order number of less value is " + orderNumber);

    }
}
