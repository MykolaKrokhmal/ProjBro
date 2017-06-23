package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class While05 {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Enter positive int N. N = 2^K, find K .");
        System.out.println("-----------------------------------------------------------------------------");

        System.out.print("Enter N value: ");
        double nValue = aScanner.nextInt();

        if (nValue < 0){
            System.out.println("N must be greater then zero.");
        }
        else {
            int quotient = 0;

            while (nValue >= 2) {
                nValue = nValue / 2;
                quotient++;
            }
            System.out.println("==========================================================================");
            if (nValue == 1)
                System.out.println("Result quotient K = " + quotient);
            else
                System.out.println("Entered N = " + Math.pow(2, quotient) * nValue + " is not a quotient of number 2. Please enter number equal to quotient of 2 (2,4,8,16,32,..)");
        }
        aScanner.close();
    }
}
