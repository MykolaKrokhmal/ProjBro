package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by NKrok on 09.06.2017.
 */
public class Case09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of month(1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter number of day(1-12): ");
        int day = sc.nextInt();

        sc.close();

        if(month < 1 || month > 12)
            System.out.println("Incorrect entered month. Restart the program.");
        else
        if (day < 1 || day > 31)
            System.out.println("Incorrect entered month. Restart the program.");
        else {
            System.out.println("--------------------------------------------------------------------------------");
            day++;
            switch (month){
                case  1: if (day == 32) day = 1; break;
                case  2: if (day == 29) day = 1; break;
                case  3: if (day == 32) day = 1; break;
                case  4: if (day == 31) day = 1; break;
                case  5: if (day == 32) day = 1; break;
                case  6: if (day == 31) day = 1; break;
                case  7: if (day == 32) day = 1; break;
                case  8: if (day == 32) day = 1; break;
                case  9: if (day == 31) day = 1; break;
                case 10: if (day == 32) day = 1; break;
                case 11: if (day == 31) day = 1; break;
                case 12: if (day == 32) day = 1; break;
            }

            if (day == 1)
                if(++month == 13) month = 1;

            System.out.println("The day next after entered is " + day + "." + month);
        }


    }
}
