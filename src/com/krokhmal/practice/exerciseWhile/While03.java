package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class While03 {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Enter posivite int N and K. Write Quotient and Remainder of the division.");
        System.out.println("---------------------------------------------------------------------");

        System.out.print("Enter N value: ");
        int nValue = aScanner.nextInt();

        if (nValue < 0){
            System.out.println("N must be greater then zero.");
        }
        else {
            System.out.print("Enter K value: ");
            int kValue = aScanner.nextInt();

            if (kValue > nValue){
                System.out.println("K must be less then N.");
            }
            else{
                int quotient = 0;

                while (nValue >= kValue) {
                    nValue = nValue - kValue;
                    quotient++;
                }
                System.out.println("========================================================================");
                System.out.println("Quotient is " + quotient);
                System.out.println("Remainder is " + nValue);
            }
        }
        aScanner.close();
    }
}
