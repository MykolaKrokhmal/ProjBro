package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class Case01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of week: ");
        int dayOfWeek = scanner.nextInt();
        String namedDayOfWeek = "";

        if( 7 < dayOfWeek || dayOfWeek < 1) {
            System.out.println("Incorrect entered number");
            System.out.println("Restart program and do it again.");
        }
        switch(dayOfWeek){
            case 1: namedDayOfWeek = "Sunday"; break;
            case 2: namedDayOfWeek = "Monday"; break;
            case 3: namedDayOfWeek = "Tuesday"; break;
            case 4: namedDayOfWeek = "Wednesday"; break;
            case 5: namedDayOfWeek = "Thursday"; break;
            case 6: namedDayOfWeek = "Friday"; break;
            case 7:  namedDayOfWeek = "Saturday";break;
        }
        System.out.println("Entered number of day is " + namedDayOfWeek);
    }

}
