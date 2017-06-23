package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */

public class While14 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter int A > 1. Find minimum K, where 1+1/2+..+1/K < A.");
        System.out.println("------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A > 0: ");
        int aValue = sc.nextInt();

        if (aValue <= 1)
            System.out.println("N must be greater, then one. Please restart the program.");
        else{

            int kValue = 2;
            double sumOfKValues = 1;
            while (sumOfKValues < aValue){
                sumOfKValues += 1.0/kValue++;
            }
            System.out.println("=========================================================================");
            System.out.println("Minimum K is " + kValue);
            System.out.println("Sum 1+1/2+..+1/K is " + sumOfKValues);
            System.out.println("1/K is " + (1.0 / kValue));
        }

        sc.close();
    }
}
