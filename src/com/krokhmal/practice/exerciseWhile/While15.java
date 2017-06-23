package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */

public class While15 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Enter bank rate interest double 0 < P < 25%.Start sum of money 1000 grn.");
        System.out.println("In how many months sum of money will grow to 1100 grn.");
        System.out.println("------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 0 < P < 25: ");
        double pValue = sc.nextDouble();

        if (0>= pValue || pValue > 25)
            System.out.println("P must be between 0 and 25%. Please restart the program.");
        else{

            int monthsCounter = 0;
            double sumOfMoney = 1000;
            while (sumOfMoney < 1100.0){
                sumOfMoney += 1000 * pValue /100;
                monthsCounter++;
            }
            System.out.println("=========================================================================");
            System.out.println("It will be more 1100 grn. after " + monthsCounter + " months.");
        }

        sc.close();
    }
}
