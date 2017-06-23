package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class Case03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of month: ");
        int month = scanner.nextInt();
        String namedQuarter = "";

        if( 12 < month || month < 1) {
            System.out.println("Incorrect entered number");
            System.out.println("Restart program and do it again.");
        }
        switch(month){
            case 1: namedQuarter = "Winter"; break;
            case 2: namedQuarter = "Winter"; break;
            case 3: namedQuarter = "Spring"; break;
            case 4: namedQuarter = "Spring"; break;
            case 5: namedQuarter = "Spring"; break;
            case 6: namedQuarter = "Summer"; break;
            case 7:  namedQuarter = "Summer";break;
            case 8:  namedQuarter = "Summer";break;
            case 9:  namedQuarter = "Autumn";break;
            case 10:  namedQuarter = "Autumn";break;
            case 11:  namedQuarter = "Autumn";break;
            case 12:  namedQuarter = "Winter";break;
        }
        System.out.println("Entered number is month of " + namedQuarter);
    }

}
