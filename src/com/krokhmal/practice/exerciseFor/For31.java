package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For31 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter int N (>0). Sequence Ak is defined as follows: ");
        System.out.println("A0 = 2, Ak = 2 + 1 / Ak-1. k=1,2,.. . Write A1,A2,..,An.");
        System.out.println("-------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int N (>0): ");
        int nValue = scanner.nextInt();

        if (nValue <= 0) {
            System.out.println("N should be greater then 0. Restart the program.");
        }
        else{

            System.out.println("=================================================================================================");

            double aValue = 2;
            for (int i = 1; i <= nValue; i += 1){
                aValue = 2 + 1 / aValue;
                System.out.println("A[" + i + "] = " + String.format("%.5f", ( aValue )));
            }
        }

        scanner.close();
    }
}
