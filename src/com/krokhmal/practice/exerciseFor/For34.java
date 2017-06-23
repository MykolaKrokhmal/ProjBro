package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For34 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter int N (>1). Sequence Ak double type is defined as follows: ");
        System.out.println("A1   = 1, A2 = 2, Ak = (A(k-2) + 2*A(k-1))/3. k=3,4,... Write A1,A2,..,An.");
        System.out.println("-------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int N (>1): ");
        int nValue = scanner.nextInt();

        scanner.close();

        if (nValue <= 1) {
            System.out.println("N should be greater then 1. Restart the program.");
        }
        else{

            System.out.println("=================================================================================================");

            double aOne = 1;
            double aTwo = 2;
            double aCurrent  = 0;
            System.out.println("A[1] = " + String.format("%.2f", aOne));
            System.out.println("A[2] = " + String.format("%.2f", aTwo));
            for (int i = 3; i <= nValue; i += 1){
                aCurrent = (aOne + 2 * aTwo) / 3;
                aTwo = aOne;
                aOne = aCurrent;
                System.out.println("A[" + i + "] = " + String.format("%.2f", aCurrent));
            }
        }


    }
}
