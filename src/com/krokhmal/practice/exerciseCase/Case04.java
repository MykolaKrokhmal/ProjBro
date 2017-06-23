package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class Case04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of month: ");
        int month = scanner.nextInt();
        int daysInMonth = 0;

        if( 12 < month || month < 1) {
            System.out.println("Incorrect entered number");
            System.out.println("Restart program and do it again.");
        }
        switch(month){
            case 1: daysInMonth = 31; break;
            case 2: daysInMonth = 28; break;
            case 3: daysInMonth = 31; break;
            case 4: daysInMonth = 30; break;
            case 5: daysInMonth = 31; break;
            case 6: daysInMonth = 30; break;
            case 7:  daysInMonth = 31;break;
            case 8:  daysInMonth = 31;break;
            case 9:  daysInMonth = 30;break;
            case 10:  daysInMonth = 31;break;
            case 11:  daysInMonth = 30;break;
            case 12:  daysInMonth = 31;break;
        }
        System.out.println("In entered month it is " + daysInMonth + " days");
    }

}
