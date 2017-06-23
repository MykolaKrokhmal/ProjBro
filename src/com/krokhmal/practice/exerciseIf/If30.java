package com.krokhmal.practice.exerciseIf;

import java.util.Scanner;

/**
 * Created by nkrok on 31.05.2017.
 */
public class If30 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Enter number between 0 and 999.");
        System.out.println("--------------------------------------------------------------------------");

        Scanner aScanner = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int inputValue  = aScanner.nextInt();


        System.out.println("==========================================================================");
        System.out.print("Entered number is");

        if (inputValue < 10){
            System.out.print(" one digit ");
        }
        else
        if (inputValue >= 10 && inputValue < 100) {
            System.out.print(" two digit ");
        }
        else
        {
            System.out.print(" three digit ");
        }

        if (inputValue < 0){
            System.out.println("negative.");
        }
        else
        {
            System.out.println("positive.");
        }

    }
}
