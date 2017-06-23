package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by NKrok on 09.06.2017.
 */
public class Case19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        sc.close();

        if(year < 0 )
            System.out.println("Incorrect entered year. Restart the program.");
        else {
            System.out.println("--------------------------------------------------------------------------------");

            String subCycle = "";

            switch (((year - 4) % 60) / 12){
                case  0: subCycle = "green"; break;
                case  1: subCycle = "red"; break;
                case  2: subCycle = "yellow"; break;
                case  3: subCycle = "white"; break;
                case  4: subCycle = "black"; break;
            }

            String yearName = "";

            switch (((year - 4) % 60) % 12){
                case  0: yearName = "rat"; break;
                case  1: yearName = "caw"; break;
                case  2: yearName = "tiger"; break;
                case  3: yearName = "hare"; break;
                case  4: yearName = "dragon"; break;
                case  5: yearName = "snake"; break;
                case  6: yearName = "horse"; break;
                case  7: yearName = "sheep"; break;
                case  8: yearName = "monkey"; break;
                case  9: yearName = "chicken"; break;
                case 10: yearName = "dog"; break;
                case 11: yearName = "pig"; break;
            }
            System.out.println("Entered year is year of " + subCycle +  " " + yearName);
        }


    }
}
