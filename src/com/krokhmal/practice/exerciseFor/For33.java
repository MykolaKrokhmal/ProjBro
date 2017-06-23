package com.krokhmal.practice.exerciseFor;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class For33 {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Enter int N (>1). Fibonacci Sequence Fk int type is defined as follows: ");
        System.out.println("F1 = 1, F2 = 1, Fk = F(k-2) + F(k-1). k=3,4,.. . Write F1,F2,..,Fn.");
        System.out.println("-------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int N (>1): ");
        int nValue = scanner.nextInt();

        if (nValue <= 1) {
            System.out.println("N should be greater then 1. Restart the program.");
        }
        else{

            System.out.println("=================================================================================================");

            int fPreviousOne = 1;
            int fPreviousTwo = 0;
            int fCurrent  = 0;
            System.out.println("F[1] = " + fPreviousOne);
            for (int i = 2; i <= nValue; i += 1){
                fCurrent = fPreviousTwo + fPreviousOne;
                fPreviousTwo = fPreviousOne;
                fPreviousOne = fCurrent;
                System.out.println("F[" + i + "] = " + fCurrent);
            }
        }

        scanner.close();
    }
}
