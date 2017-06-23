package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For35 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter int N (>2). Sequence Ak double type is defined as follows: ");
        System.out.println("A1   = 1, A2 = 2, A3 = 3, Ak = (A(k-1) + A(k-2) - 2A(k-3)). k=4,5,... Write A1,A2,..,An.");
        System.out.println("-------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int N (>2): ");
        int nValue = scanner.nextInt();

        scanner.close();

        if (nValue <= 2) {
            System.out.println("N should be greater then 2. Restart the program.");
        }
        else{

            System.out.println("=================================================================================================");

            double aOne      = 1;
            double aTwo      = 2;
            double aThree    = 3;
            double aCurrent  = 0;
            System.out.println("A[1] = " + String.format("%.2f", aOne));
            System.out.println("A[2] = " + String.format("%.2f", aTwo));
            System.out.println("A[3] = " + String.format("%.2f", aThree));
            for (int i = 4; i <= nValue; i += 1){
                aCurrent = aThree + aTwo - 2 * aOne;
                aOne     = aTwo;
                aTwo     = aThree;
                aThree   = aCurrent;
                System.out.println("A[" + i + "] = " + String.format("%.2f", aCurrent));
            }
        }


    }
}
