package com.krokhmal.practice.exerciseWhile;

import java.util.Scanner;

/**
 * Created by NKrok on 08.06.2017.
 */
public class While21 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Enter N >0. Define is it exist odd digits in this number. If yes, write TRUE else FALSE.");
        System.out.println("-------------------------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N >0: ");
        int nValue = sc.nextInt();
        sc.close();

        if (nValue <= 0) {
            System.out.println("Please enter N more then 0. Restart the program.");
        }
        else{
            System.out.println("===========================================================================================");
            boolean isTrue = false;
            while (!isTrue && nValue > 0) {
                isTrue = ((nValue % 10) % 2 != 0);
                nValue /= 10;
            }
            System.out.println("In this number exist odd digits is " + isTrue);
        }
    }
}
