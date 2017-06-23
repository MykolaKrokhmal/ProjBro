package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by nkrok on 31.05.2017.
 */
public class If28 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Define days count in entered year.");
        System.out.println("--------------------------------------------------------------------------");

        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int yearInput  = aScanner.nextInt();

        boolean leapYear = false;
        if(yearInput % 100 != 0 && yearInput % 400 != 0 && yearInput % 4 == 0){
            leapYear = true;
        }

        System.out.println("==========================================================================");
        System.out.print("Entered year " + yearInput + " is ");
        if(leapYear) {
            System.out.println("leap-year.");
        }
        else {
            System.out.println("not leap-year.");
        }

    }
}
