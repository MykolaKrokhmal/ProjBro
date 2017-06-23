package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by User on 04.06.2017.
 */
public class Case02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of grade(1-5): ");
        int month = scanner.nextInt();
        String named = "";

        if( 5 < month || month < 1) {
            System.out.println("Incorrect entered number");
            System.out.println("Restart program and do it again.");
        }
        switch(month){
            case 1: named = "Bad"; break;
            case 2: named = "Unsatisfactory"; break;
            case 3: named = "Satisfactory"; break;
            case 4: named = "Good"; break;
            case 5: named = "Best"; break;
        }
        System.out.println("This grade is " + named);
    }

}
