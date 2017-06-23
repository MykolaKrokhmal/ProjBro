package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class While06 {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Enter positive int N>0. Calculate double factorial N!!=N*(N-2)*(N-4).");
        System.out.println("-----------------------------------------------------------------------------");

        System.out.print("Enter N value: ");
        double nValue = aScanner.nextInt();

        if (nValue <= 0){
            System.out.println("N must be greater then zero.");
        }
        else {
            double doubleFactorial = nValue;
            while (nValue > 0) {
                doubleFactorial *= nValue;
                nValue -= 2;
            }
            System.out.println("==========================================================================");
            System.out.println("Result quotient N!! = " + doubleFactorial);
        }
        aScanner.close();
    }
}
