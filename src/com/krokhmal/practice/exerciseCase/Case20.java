package com.krokhmal.practice.exerciseCase;

import java.util.Scanner;

/**
 * Created by NKrok on 09.06.2017.
 */
public class Case20 {
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

            String sodiac = "";
            switch (month){
                case  1:    if (1  <= day && day <= 19)
                                sodiac = "Capricorn";
                            else
                            if (20 <= day && day <= 31)
                                sodiac = "Aquarius";
                            else
                                System.out.println("Incorrect day of January");
                            break;
                case  2:    if (1  <= day && day <= 18)
                                sodiac = "Aquarius";
                            else
                            if (19 <= day && day <= 28)
                                sodiac = "Fish";
                            else
                                System.out.println("Incorrect day of February");
                            break;
                case  3:    if (1  <= day && day <= 20)
                                sodiac = "Fish";
                            else
                            if (21 <= day && day <= 31)
                                sodiac = "Aries";
                            else
                                System.out.println("Incorrect day of March");
                            break;
                case  4:    if (1  <= day && day <= 19)
                                sodiac = "Aries";
                            else
                            if (20 <= day && day <= 30)
                                sodiac = "Taurus";
                            else
                                System.out.println("Incorrect day of April");
                            break;
                case  5:    if (1  <= day && day <= 20)
                                sodiac = "Taurus";
                            else
                            if (21 <= day && day <= 31)
                                sodiac = "Twins";
                            else
                                System.out.println("Incorrect day of May");
                            break;
                case  6:    if (1  <= day && day <= 21)
                                sodiac = "Twins";
                            else
                            if (22 <= day && day <= 30)
                                sodiac = "Cancer";
                            else
                                System.out.println("Incorrect day of June");
                            break;
                case  7:    if (1  <= day && day <= 22)
                                sodiac = "Cancer";
                            else
                            if (23 <= day && day <= 31)
                                sodiac = "Lion";
                            else
                                System.out.println("Incorrect day of July");
                            break;
                case  8:    if (1  <= day && day <= 22)
                                sodiac = "Lion";
                            else
                            if (22 <= day && day <= 31)
                                sodiac = "Virgin";
                            else
                                System.out.println("Incorrect day of August");
                            break;
                case  9:    if (1  <= day && day <= 22)
                                sodiac = "Virgin";
                            else
                            if (23 <= day && day <= 30)
                                sodiac = "Libra";
                            else
                                System.out.println("Incorrect day of September");
                            break;
                case 10:    if (1  <= day && day <= 22)
                                sodiac = "Libra";
                            else
                            if (23 <= day && day <= 31)
                                sodiac = "Scorpio";
                            else
                                System.out.println("Incorrect day of October");
                            break;
                case 11:    if (1  <= day && day <= 22)
                                sodiac = "Scorpio";
                            else
                            if (23 <= day && day <= 30)
                                sodiac = "Sagittarius";
                            else
                                System.out.println("Incorrect day of November");
                            break;
                case 12:    if (1  <= day && day < 21)
                                sodiac = "Sagittarius";
                            else
                            if (22 <= day && day <= 31)
                                sodiac = "Capricorn";
                            else
                                System.out.println("Incorrect day of December");
                            break;
                default:    System.out.println("Incorrect number of month.");
            }
            if (sodiac.length() != 0)
                System.out.println("Name of sodiac is " + sodiac);
        }
    }
}
