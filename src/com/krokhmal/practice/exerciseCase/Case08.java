package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by NKrok on 09.06.2017.
 */
public class Case08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of month: ");
        int month = sc.nextInt();

        System.out.print("Enter number of day: ");
        int day = sc.nextInt();

        sc.close();

        if(month < 1 || month > 12)
            System.out.println("Incorrect entered month. Restart the program.");
        else
        if (day < 1 || day > 31)
            System.out.println("Incorrect entered month. Restart the program.");
        else {
            System.out.println("--------------------------------------------------------------------------------");
            if (--day == 0) {
                if (--month == 0)
                    month = 12;

                switch (month){
                    case  1: day = 31; break;
                    case  2: day = 28; break;
                    case  3: day = 31; break;
                    case  4: day = 30; break;
                    case  5: day = 31; break;
                    case  6: day = 30; break;
                    case  7: day = 31; break;
                    case  8: day = 31; break;
                    case  9: day = 30; break;
                    case 10: day = 31; break;
                    case 11: day = 30; break;
                    case 12: day = 31; break;
                }
            }
            System.out.println("The day before entered is " + day + "." + month);
        }


    }
}
