package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class While01 {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Enter length of lines A and B. B line must be not less line A.");
        System.out.println("---------------------------------------------------------------------");

        System.out.print("Enter A value: ");
        int aValue = aScanner.nextInt();
        System.out.print("Enter B value: ");
        int bValue = aScanner.nextInt();


        System.out.println("=====================================================================");

        if(aValue < bValue) {
            System.out.println("Incorrect. Line B is less then line A.");
        }
        else {
            int countBinA = 0;

            while (aValue >= bValue) {
                aValue = aValue - bValue;
                countBinA++;
            }
            System.out.println("Rest part of line A is " + aValue);

        }
    }
}
