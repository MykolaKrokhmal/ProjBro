package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class While04 {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Enter positive int N. If it is degree of number \"3\", write TRUE else FALSE.");
        System.out.println("-----------------------------------------------------------------------------");

        System.out.print("Enter N value: ");
        int nValue = aScanner.nextInt();

        if (nValue < 0){
            System.out.println("N must be greater then zero.");
        }
        else {
            int quotient = 0;

            while (nValue >= 3) {
                nValue = nValue / 3;
                quotient++;
            }
            System.out.println("==========================================================================");
            if (nValue == 1)
                System.out.println("This value is degree of number 3 is TRUE");
            else
                System.out.println("This value is degree of number 3 is FALSE");
        }
        aScanner.close();
    }
}
